import java.util.Scanner;
public class P2H
{
    public P2H()
    {
        int counter = 0;
        do{
            // creating an object of the Scanner class
            Scanner user = new Scanner(System.in);
            System.out.println("Enter your username: ");
            // creating a variable to store user input
            String userName = user.nextLine();
            // System.out.println("Your username is " + userName);
            // creating an object of the Scanner class password
            Scanner pass = new Scanner(System.in);
            System.out.println("Enter your password: ");
            try{
                // creating a variable to store user input
                int password = pass.nextInt();
                // System.out.println("Your password is " + password);
                System.out.println("You have successfully logged in");
            }
            catch(Exception e){
                System.out.println("Login unsuccessful…try again");
            }
            counter += 1;
        }while(counter <= 3);
        System.out.println("You have exceeded your three attempts.\nPlease try again next period.");

    }
}