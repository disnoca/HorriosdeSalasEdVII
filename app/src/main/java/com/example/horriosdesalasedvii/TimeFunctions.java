package com.example.horriosdesalasedvii;

public class TimeFunctions {

    private static final int MINUTES_IN_AN_HOUR = 60;
    private static final int MINUTES_IN_A_DAY = 1440;
    private static final int WEEK_DAYS = 7;

    public static int minutesUntil(int target_weekday, int target_time) {
        return minutesFromUntil(MainActivity.weekday(), target_weekday, MainActivity.timeInMinutes(), target_time);
    }

    public static int minutesFromUntil(int start_weekday, int end_weekday, int start_time, int end_time) {
        if(start_weekday != end_weekday)
            return weekdayMinutesDifference(start_weekday, end_weekday) + end_time;
        return end_time - start_time;
    }

    public static int weekdayMinutesDifference(int weekday, int target_weekday) {
        int minutes = 0;
        int diff_weekdays;
        if(target_weekday > weekday)
            diff_weekdays = target_weekday-weekday;
        else
            diff_weekdays = WEEK_DAYS-(weekday-target_weekday);

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
