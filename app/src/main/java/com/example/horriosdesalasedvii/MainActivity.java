package com.example.horriosdesalasedvii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

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

import com.example.horriosdesalasedvii.RecyclerAdapters.AvailableClassroomsRecyclerAdapter;
import com.example.horriosdesalasedvii.RecyclerAdapters.UpcomingClassroomsRecyclerAdapter;
import com.example.horriosdesalasedvii.ViewPagerAdapter.ViewPagerAdapter;
import com.example.horriosdesalasedvii.ViewPagerAdapter.ViewPagerItem;
import com.example.horriosdesalasedvii.classroom.AvailableClassroomComparator;
import com.example.horriosdesalasedvii.classroom.Classroom;
import com.example.horriosdesalasedvii.classroom.ClassroomsLoader;
import com.example.horriosdesalasedvii.classroom.UnavailableClassroomComparator;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private BroadcastReceiver tickReceiver;
    private ArrayList<Classroom> allClassrooms, availableClassrooms, unavailableClassrooms;
    private RecyclerView.Adapter<? extends RecyclerView.ViewHolder> acRecyclerViewAdapter, ucRecyclerViewAdapter;
    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    private static Calendar calendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tab_layout);

        allClassrooms = ClassroomsLoader.getClassrooms();
        availableClassrooms = new ArrayList<>(allClassrooms.size());
        unavailableClassrooms = new ArrayList<>(allClassrooms.size());
        calendar = Calendar.getInstance();
        updateClassrooms();

        acRecyclerViewAdapter = new AvailableClassroomsRecyclerAdapter(availableClassrooms);
        ucRecyclerViewAdapter = new UpcomingClassroomsRecyclerAdapter(unavailableClassrooms);

        setUpViewPager();
        linkTabsToViewPager();
    }

    private void setUpViewPager() {
        ArrayList<ViewPagerItem> viewPagerItemArrayList = new ArrayList<>(2);
        viewPagerItemArrayList.add(new ViewPagerItem(acRecyclerViewAdapter));
        viewPagerItemArrayList.add(new ViewPagerItem(ucRecyclerViewAdapter));

        viewPager.setAdapter(new ViewPagerAdapter(viewPagerItemArrayList));
        viewPager.setOffscreenPageLimit(1);
        viewPager.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);
    }

    private void linkTabsToViewPager() {
        String[] tabsText = {"Available", "Upcoming"};
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> tab.setText(tabsText[position])).attach();
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
        updateClassrooms();
        acRecyclerViewAdapter.notifyDataSetChanged();
        ucRecyclerViewAdapter.notifyDataSetChanged();
    }

    private void updateClassrooms() {
        availableClassrooms.clear();
        unavailableClassrooms.clear();
        int weekday = weekday();
        int current_time = timeInMinutes();

        for(Classroom classroom : allClassrooms) {
            if (classroom.isAvailable(weekday, current_time))
                availableClassrooms.add(classroom);
            else
                unavailableClassrooms.add(classroom);
        }

        Collections.sort(availableClassrooms, new AvailableClassroomComparator());
        Collections.sort(unavailableClassrooms, new UnavailableClassroomComparator());
    }

    public static int timeInMinutes() {
        return calendar.get(Calendar.HOUR_OF_DAY)*60 + calendar.get(Calendar.MINUTE);
    }

    public static int weekday() {
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

}