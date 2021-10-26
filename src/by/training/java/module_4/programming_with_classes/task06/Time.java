package by.training.java.module_4.programming_with_classes.task06;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public String getCurrentTime() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void setTime(String fullTime, int parameter) {
        String[] arrayTime = fullTime.split(" ");
        if (arrayTime.length == 3 && !fullTime.matches("(.*)[a-zа-яA-ZА-Я]+(.*)")) {
            Integer enteredHours = Integer.valueOf(arrayTime[0]);
            Integer enteredMinute = Integer.valueOf(arrayTime[1]);
            Integer enteredSecond = Integer.valueOf(arrayTime[2]);

            if (parameter == 1) {
                setHour(enteredHours);
                setMinute(enteredMinute);
                setSecond(enteredSecond);
            } else {
                second += enteredSecond;
                if (second > 0) {
                    minute += second / 60;
                    second %= 60;
                }
                minute += enteredMinute;
                if (minute > 0) {
                    hour += minute / 60;
                    minute %= 60;
                }
                hour += enteredHours;
                if (hour > 0) {
                    hour %= 24;
                }
            }
        }
    }

    public void setHour(int number) {
        if (number >= 0 && number <= 23) {
            hour = number;
        } else {
            hour = 0;
        }
    }

    public void setMinute(int number) {
        if (number >= 0 && number <= 59) {
            minute = number;
        } else {
            minute = 0;
        }
    }

    public void setSecond(int number) {
        if (number >= 0 && number <= 59) {
            second = number;
        } else {
            second = 0;
        }
    }
}
