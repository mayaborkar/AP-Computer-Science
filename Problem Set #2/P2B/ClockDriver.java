import java.util.Scanner;
public class ClockDriver
{
    public ClockDriver()
    {
        Scanner hours = new Scanner(System.in);
        System.out.println("Input the hour: ");
        int hour = hours.nextInt();
        
        Scanner mins = new Scanner(System.in);
        System.out.println("Input the minute: ");
        int minute = mins.nextInt();
        
        Scanner seconds = new Scanner(System.in);
        System.out.println("Input the second: ");
        int second = seconds.nextInt();
        
        
        Clock kitchenClock = new Clock();
        Clock bedroomClock = new Clock(hour, minute, second);
        System.out.println(kitchenClock.toString());
        System.out.println(bedroomClock.toString());
    }
}
