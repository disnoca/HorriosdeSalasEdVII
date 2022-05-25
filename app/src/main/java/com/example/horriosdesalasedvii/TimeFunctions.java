package com.example.horriosdesalasedvii;

import com.example.horriosdesalasedvii.classroom.ClassBlock;

import java.util.Calendar;

public class TimeFunctions {

    private static final int MINUTES_IN_AN_HOUR = 60;
    private static final int MINUTES_IN_A_DAY = 1440;
    private static final int WEEK_DAYS = 7;

    public static int minutesUntil(ClassBlock class_block) {
        int weekday = MainActivity.weekday();
        if(class_block.getWeekday() != weekday)
            return weekdayMinutesDifference(weekday, class_block.getWeekday()) + class_block.getStartTime();
        return class_block.getStartTime() - timeInMinutes();
    }

    public static int weekdayMinutesDifference(int weekday, int class_weekday) {
        int minutes = 0;
        int diff_weekdays;
        if(class_weekday > weekday)
            diff_weekdays = class_weekday-weekday;
        else
            diff_weekdays = WEEK_DAYS-(weekday-class_weekday);

        for(int i = 0; i < diff_weekdays-1; i++)
            minutes += MINUTES_IN_A_DAY;

        return minutes+(MINUTES_IN_A_DAY-timeInMinutes());
    }

    public static int timeInMinutes() {
        return MainActivity.timeInMinutes();
    }

    public static int[] minutesToHours(int minutes) {
        int[] time = new int[3];
        time[0] = minutes/MINUTES_IN_A_DAY;
        minutes -= time[0]*MINUTES_IN_A_DAY;
        time[1] = minutes/MINUTES_IN_AN_HOUR;
        minutes -= time[1]*MINUTES_IN_AN_HOUR;
        time[2] = minutes;
        return time;
    }

    public static String weekdayToString(int weekday) {
        switch (weekday) {
            case 1: return "Sun";
            case 2: return "Mon";
            case 3: return "Tue";
            case 4: return "Wed";
            case 5: return "Thu";
            case 6: return "Fri";
            case 7: return "Sat";
            default: return "";
        }
    }

}
