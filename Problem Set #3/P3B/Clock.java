public class Clock
{
    int hours;
    int minutes;
    int seconds;
    int totalSeconds;
    
    public Clock()
    {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    
    public Clock(int hr, int min, int sec){
        hours = hr;
        minutes = min;
        seconds = sec;
    }
    
    public  void setTime(int timeHours, int timeMinute, int timeSeconds){
        this.hours = timeHours;
        this.minutes = timeMinute;
        this.seconds = timeSeconds;
    }
    
    public void convertDaylightSaving(int hour){
        this.hours += hour;
    }
    
    public int totalSeconds(){
        totalSeconds = this.hours * 3600 + this.minutes * 60 + this.seconds;
        return totalSeconds;
    }

    public String toString()
    {
        String str = "";
        str += "\nThe time is " + hours + ":" + minutes + ":" + seconds + "\n";
        str += "The total amount of seconds is: " + totalSeconds();
        return str;
    }
}
