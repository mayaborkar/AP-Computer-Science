import java.util.*;
public class PasswordCreator
{
    public PasswordCreator()
    {
        boolean isValid;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input your last name: ");
        String lastName = input.nextLine();
        
        do{
            isValid = true;
            Scanner pwd = new Scanner(System.in);
            System.out.print("Please input your password (passwords should have at least 6 characters, \nat least one non-alphanumeric character (+, -, *, /, or @), \nand must not contain your last name : ");
            String password = input.nextLine();
            int nonAlphaNumericCount = 0;
            
            // Checking if pwd fits length requirement
            if (password.length() < 6){
                System.out.println("Enter a password with at least 6 characters");
                isValid = false;
            }
            
            // Checking if pwd has an non-alphanumeric character
            for(int i = 0; i < password.length(); i++){
                if (password.charAt(i) == '+' || password.charAt(i) == '-' || password.charAt(i) == '*' || password.charAt(i) == '/' || password.charAt(i) == '@'){
                    nonAlphaNumericCount += 1;
                }
            }
            
            if(password.toLowerCase().contains(lastName.toLowerCase())){
                    System.out.println("Enter a password that does not contain your last name");
                    isValid = false;
                }
            
            if (nonAlphaNumericCount < 1){
                System.out.println("Enter a password with at least one non-alphanumeric character (+, -, *, /, or @)");
                isValid = false;
            }
        }while(!isValid);
    }
}
