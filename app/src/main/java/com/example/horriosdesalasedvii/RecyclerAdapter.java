package com.example.horriosdesalasedvii;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.horriosdesalasedvii.classroom.ClassBlock;
import com.example.horriosdesalasedvii.classroom.Classroom;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private final ArrayList<Classroom> availableClassrooms;

    public RecyclerAdapter(ArrayList<Classroom> allClassrooms) {
        this.availableClassrooms = allClassrooms;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView classroom_text;
        private final TextView remaining_text;
        private final TextView until_text;

        public MyViewHolder(final View view) {
            super(view);
            classroom_text = view.findViewById(R.id.classroom_no);
            remaining_text = view.findViewById(R.id.time_remaining);
            until_text = view.findViewById(R.id.until_time);
        }
    }


    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        Classroom classroom = availableClassrooms.get(position);
            ClassBlock class_block = classroom.getNextClassBlock(MainActivity.weekday()-1, MainActivity.timeInMinutes());

        String classroom_id = classroom.getClassroomId();
        holder.classroom_text.setText(classroom_id);

        int[] remaining_time = TimeFunctions.minutesToHours(TimeFunctions.minutesUntil(class_block));
        holder.remaining_text.setText(getRemainingTimeText(remaining_time));

        int[] until_time = TimeFunctions.minutesToHours(class_block.getStartTime());
        holder.until_text.setText(getUntilTimeText(until_time, class_block.getWeekday()));
    }

    @Override
    public int getItemCount() {
        return availableClassrooms.size();
    }

    private String getRemainingTimeText(int[] remaining_time) {
        String days = "";
        String hours = remaining_time[1]+"h";
        String minutes = String.valueOf(remaining_time[2]);
        if(remaining_time[0] > 0) days = remaining_time[0]+"d";
        if(remaining_time[0] == 0 && remaining_time[1] == 0) {
            minutes+="min";
            hours = "";
        }
        else if(remaining_time[2] < 10) minutes = "0"+remaining_time[2];
        return days+hours+minutes;
    }

    private String getUntilTimeText(int[] until_time, int weekday) {
        String hours = until_time[1]+"h";
        String minutes = String.valueOf(until_time[2]);
        if(until_time[1] < 10) hours = "0"+until_time[1]+"h";
        if(until_time[2] < 10) minutes = "0"+until_time[2];
        if(MainActivity.weekday() == weekday)
            return hours+minutes;
        return TimeFunctions.weekdayToString(weekday) + " " + hours + minutes;
    }

}
