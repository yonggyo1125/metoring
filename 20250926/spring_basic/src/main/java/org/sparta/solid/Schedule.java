package org.sparta.solid;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) { // 캡슐화

        if (month == 2 && day > 28) {
            day = 28;
        }

        this.day = day;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
