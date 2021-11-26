import java.util.*;
public class RadiusOfCircle
{
    public RadiusOfCircle()
    {
        Scanner circle = new Scanner(System.in);
        System.out.print("What is your area? ");
        int area = circle.nextInt();
        double radius = Math.sqrt((area)/(Math.PI));
        System.out.println("Radius of your circle is " + radius + ".");
        
    }
}
