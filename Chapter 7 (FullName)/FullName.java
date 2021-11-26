import java.util.*;
public class FullName
{
    public FullName()
    {
        Scanner name = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String firstName = name.nextLine();
        System.out.print("What is your last name? ");
        String lastName = name.nextLine();
        System.out.print("Your full name is " + firstName +" " + lastName);
    }
}
