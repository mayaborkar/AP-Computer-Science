import java.util.Scanner;
public class Tester
{
    
    public Tester()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the A value for the line: ");
        DistToLine.A = input.nextDouble();
        
        System.out.println("Enter the B value for the line: ");
        DistToLine.B = input.nextDouble();
        
        System.out.println("Enter the C value for the line: ");
        DistToLine.C = input.nextDouble();
        
        System.out.println("Enter the x coordinate of the point: ");
        double a = input.nextDouble();
        
        System.out.println("Enter the y coordinate of the point: ");
        double b = input.nextDouble();
         
        double distance = DistToLine.getDist(a, b);
        
        System.out.println("\nDistance from the point to the line is: "+ distance);
    }

}
