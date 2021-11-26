import java.util.Scanner;
public class ClockDriver
{
    public ClockDriver()
    {
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock.toString());
        kitchenClock.setTime(10, 50, 30);
        
        System.out.println(kitchenClock.toString());
        kitchenClock.convertDaylightSaving(-1);
        System.out.println(kitchenClock.toString());
    }
}
