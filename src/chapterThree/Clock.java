package chapterThree;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second){
        if (hour <= 23){
            this.hour = hour;
        }
        if (minute <= 59) {
            this.minute = minute;
        }
        if (second <= 59) {
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
            this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
            this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
            this.second = second;
    }

    public void displayTime(){
        System.out.printf("%d:%d:%d%n", getHour(), getMinute(), getSecond());
    }
}
