public class Clock
{
    int hours;
    int minutes;
    int seconds;
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

    public String toString()
    {
        String str = "";
        str = str + "\nThe time is " + hours + ":" + minutes + ":" + seconds + "\n";
        return str;
    }
}
