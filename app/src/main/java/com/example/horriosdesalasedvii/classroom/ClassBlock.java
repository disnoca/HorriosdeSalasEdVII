package com.example.horriosdesalasedvii.classroom;

public class ClassBlock {

    private final int start_time, end_time;
    private final int weekday;

    public ClassBlock(int weekday, int start_time, int end_time) {
        this.weekday = weekday;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public int getStartTime() {
        return start_time;
    }

    public int getEndTime() {
        return end_time;
    }

    public int getWeekday() {
        return weekday;
    }

    public boolean isAvailable(int weekday, int current_time) {
        return weekday != this.weekday || !(current_time>=start_time && current_time<end_time);
    }

}
