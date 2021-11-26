import java.util.*;
public class name
{
    public name()
    {
        Scanner name = new Scanner(System.in);
        System.out.print("Please enter your name. ");
        String yourName = name.nextLine();
        for (int i = yourName.length(); i > 0; i--){
            
            System.out.print(yourName.substring(i - 1, i).toLowerCase());
        }
    }
}
