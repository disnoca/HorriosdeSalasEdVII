package com.example.horriosdesalasedvii.classroom;

import com.example.horriosdesalasedvii.MainActivity;
import com.example.horriosdesalasedvii.TimeFunctions;

import java.util.ArrayList;
import java.util.Iterator;

public class Classroom implements Comparable<Classroom> {

    private final String classroom_id;

    private final ArrayList<ClassBlock>[] weekTT;

    public Classroom(String classroom_id, ArrayList<ClassBlock>[] weekTT) {
        this.classroom_id = classroom_id;
        this.weekTT = weekTT;
    }

    public String getClassroomId() {
        return classroom_id;
    }

    public boolean isAvailable(int weekday, int current_time) {
        return getNextClassBlock(weekday-1, current_time).isAvailable(weekday, current_time);
    }

    public ClassBlock getNextClassBlock(int weekdaypos, int current_time) {
        if(weekdaypos >= 7)  {weekdaypos = 0;}
        if(weekTT[weekdaypos].isEmpty() ||
                current_time >= weekTT[weekdaypos].get(weekTT[weekdaypos].size()-1).getEndTime())
            return getNextClassBlock(weekdaypos + 1, 0);
        if(current_time < weekTT[weekdaypos].get(0).getEndTime())
            return weekTT[weekdaypos].get(0);

        ClassBlock class_block, prev_class_block;
        Iterator<ClassBlock> it = weekTT[weekdaypos].iterator();
        prev_class_block = it.next();
        while(it.hasNext()) {
            class_block = it.next();
            if(!class_block.isAvailable(weekdaypos+1, current_time))
                return class_block;
            if(current_time >= prev_class_block.getEndTime() && current_time < class_block.getStartTime())
                return class_block;
        }

        return getNextClassBlock(weekdaypos+1, 0);
    }

    @Override
    public int compareTo(Classroom c) {
        int minutes_until1 = TimeFunctions.minutesUntil(getNextClassBlock(MainActivity.weekday()-1, MainActivity.timeInMinutes()));
        int minutes_until2 = TimeFunctions.minutesUntil(c.getNextClassBlock(MainActivity.weekday()-1, MainActivity.timeInMinutes()));

        if(minutes_until1 > minutes_until2) return -1;
        if(minutes_until1 < minutes_until2) return 1;
        return 0;
    }
}
