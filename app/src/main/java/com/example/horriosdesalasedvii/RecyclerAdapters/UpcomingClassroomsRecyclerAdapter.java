package com.example.horriosdesalasedvii.RecyclerAdapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.horriosdesalasedvii.MainActivity;
import com.example.horriosdesalasedvii.R;
import com.example.horriosdesalasedvii.TimeFunctions;
import com.example.horriosdesalasedvii.classroom.ClassBlock;
import com.example.horriosdesalasedvii.classroom.Classroom;

import java.util.ArrayList;

public class UpcomingClassroomsRecyclerAdapter extends RecyclerView.Adapter<UpcomingClassroomsRecyclerAdapter.MyViewHolder> {

    private final ArrayList<Classroom> unavailableClassrooms;

    public UpcomingClassroomsRecyclerAdapter(ArrayList<Classroom> allClassrooms) {
        this.unavailableClassrooms = allClassrooms;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView classroom_text;
        private final TextView remaining_text;
        private final TextView duration_text;

        public MyViewHolder(final View view) {
            super(view);
            classroom_text = view.findViewById(R.id.uc_classroom_no);
            remaining_text = view.findViewById(R.id.uc_time_remaining);
            duration_text = view.findViewById(R.id.uc_duration_time);
        }
    }


    @NonNull
    @Override
    public UpcomingClassroomsRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.upcoming_classrooms_list, parent, false);
        return new UpcomingClassroomsRecyclerAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull UpcomingClassroomsRecyclerAdapter.MyViewHolder holder, int position) {
        Classroom classroom = unavailableClassrooms.get(position);
        ClassBlock curr_class_block = classroom.getNextClassBlock(MainActivity.weekday()-1, MainActivity.timeInMinutes());
        ClassBlock next_class_block = classroom.getClassBlockAfter(curr_class_block);

        String classroom_id = classroom.getClassroomId();
        holder.classroom_text.setText(classroom_id);

        int[] remaining_time = TimeFunctions.minutesToHours(TimeFunctions.minutesUntil(curr_class_block.getWeekday(), curr_class_block.getEndTime()));
        holder.remaining_text.setText(getRemainingTimeText(remaining_time));

        int[] duration_time = TimeFunctions.minutesToHours(TimeFunctions.minutesFromUntil(
                curr_class_block.getWeekday(), next_class_block.getWeekday(), curr_class_block.getEndTime(), next_class_block.getStartTime()));
        holder.duration_text.setText(getDurationTimeText(duration_time));
    }

    @Override
    public int getItemCount() {
        return unavailableClassrooms.size();
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

    private String getDurationTimeText(int[] duration_time) {
        String days = "";
        String hours = duration_time[1]+"h";
        String minutes = "";
        if(duration_time[0] > 0) days = duration_time[0]+"d";
        if(duration_time[2] > 0) minutes = String.valueOf(duration_time[2]);
        if(duration_time[0] == 0 && duration_time[1] == 0) {
            minutes+="min";
            hours = "";
        }
        return days+hours+minutes;
    }

}
