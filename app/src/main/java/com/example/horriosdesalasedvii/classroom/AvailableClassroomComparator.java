package com.example.horriosdesalasedvii.classroom;

import com.example.horriosdesalasedvii.MainActivity;
import com.example.horriosdesalasedvii.TimeFunctions;

import java.util.Comparator;

public class AvailableClassroomComparator implements Comparator<Classroom> {

    @Override
    public int compare(Classroom c1, Classroom c2) {
        ClassBlock c1ClassBlock = c1.getNextClassBlock(MainActivity.weekday()-1, MainActivity.timeInMinutes());
        ClassBlock c2ClassBlock = c2.getNextClassBlock(MainActivity.weekday()-1, MainActivity.timeInMinutes());
        int minutes_until1 = TimeFunctions.minutesUntil(c1ClassBlock.getWeekday(), c1ClassBlock.getStartTime());
        int minutes_until2 = TimeFunctions.minutesUntil(c2ClassBlock.getWeekday(), c2ClassBlock.getStartTime());

        return Integer.compare(minutes_until2, minutes_until1);
    }
}
