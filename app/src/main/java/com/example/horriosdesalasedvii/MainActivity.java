package com.example.horriosdesalasedvii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.example.horriosdesalasedvii.classroom.Classroom;
import com.example.horriosdesalasedvii.classroom.ClassroomsLoader;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private BroadcastReceiver tickReceiver;

    private ArrayList<Classroom> allClassrooms, availableClassrooms;
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    private static Calendar calendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        allClassrooms = ClassroomsLoader.getClassrooms();
        availableClassrooms = new ArrayList<>();
        calendar = Calendar.getInstance();
        updateAvailableClassrooms();
        setAdapter();
    }

    private void setAdapter() {
        adapter = new RecyclerAdapter(availableClassrooms);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        initClock();

        tickReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                initClock();
            }
        };
        registerReceiver(tickReceiver, new IntentFilter(Intent.ACTION_TIME_TICK));
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(tickReceiver);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(tickReceiver!=null)
            unregisterReceiver(tickReceiver);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // R.menu.mymenu is a reference to an xml file named mymenu.xml which should be inside your res/menu directory.
        // If you don't have res/menu, just create a directory named "menu" inside res
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // handle button activities
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mybutton) {
            showPopupWindow();
        }
        return super.onOptionsItemSelected(item);
    }

    void showPopupWindow() {
        // inflate the layout of the popup window
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.popup_window, null);

        // create the popup window
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        // show the popup window
        // which view you pass in doesn't matter, it is only used for the window tolken
        popupWindow.showAtLocation(findViewById(R.id.mybutton), Gravity.CENTER, 0, 0);

        // dismiss the popup window when touched
        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.performClick();
                popupWindow.dismiss();
                return true;
            }
        });
    }




    private void initClock() {
        calendar = Calendar.getInstance();
        updateAvailableClassrooms();
        adapter.notifyDataSetChanged();
    }

    private void updateAvailableClassrooms() {
        availableClassrooms.clear();
        int weekday = weekday();
        int current_time = timeInMinutes();

        for(Classroom classroom : allClassrooms)
            if(classroom.isAvailable(weekday, current_time))
                availableClassrooms.add(classroom);

        Collections.sort(availableClassrooms);
    }

    public static int timeInMinutes() {
        return calendar.get(Calendar.HOUR_OF_DAY)*60 + calendar.get(Calendar.MINUTE);
    }

    public static int weekday() {
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

}