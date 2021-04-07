package Tdd;public class Time {


    private int hour;
    private int minutes;
    private int seconds;

    public Time(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHour(int hour) {
        if(hour >0 && hour <=24)
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinutes(int minutes) {

        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {

        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

   public void validateHour(int hour) {
       boolean isHourValid = (hour > 0 && hour <= 24);
       if (!isHourValid) {
           throw new IllegalArgumentException("hour is out of range");
       }
   }
    public void validateMinutes(int minutes) {
        boolean isMinutesValid = (minutes > 0 && minutes <= 60);
        if (!isMinutesValid) {
            throw new IllegalArgumentException("Minutes is out of range");

        }
    }
    public void validateSeconds(int seconds) {
        boolean isSecondsValid = (seconds>0 && seconds <=60);
        if(! isSecondsValid){
            throw new IllegalArgumentException("seconds is out of range");

        }

    }


}
