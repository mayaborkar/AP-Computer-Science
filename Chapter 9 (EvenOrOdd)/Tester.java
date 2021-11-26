import java.util.*;
public class Tester
{
    public static void main()
    {
       Scanner num = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       int yourNum = num.nextInt();
       if (yourNum % 2 == 0)
       System.out.print("The integer " + yourNum + " is even.");
       else System.out.print("The integer " + yourNum + " is odd.");
    }
}
