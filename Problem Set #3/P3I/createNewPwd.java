import java.util.*;
public class createNewPwd
{
    public createNewPwd()
    {
        boolean isValid;
        do{
            isValid = true;
            Scanner input = new Scanner(System.in);
            System.out.print("Please input your password (passwords should have t least 6 characters and at least one non-alphanumeric character (+, -, *, /, or @) : ");
            String password = input.nextLine();
            int nonAlphaNumericCount = 0;
            if (password.length() < 6){
                System.out.println("Enter a password with at least 6 characters");
                isValid = false;
            }
            
            for(int i = 0; i < password.length(); i++){
                if (password.charAt(i) == '+' || password.charAt(i) == '-' || password.charAt(i) == '*' || password.charAt(i) == '/' || password.charAt(i) == '@'){
                    nonAlphaNumericCount += 1;
                }
            }
            
            if (nonAlphaNumericCount < 1 || nonAlphaNumericCount > 1){
                System.out.println("Enter a password with at least one non-alphanumeric character (+, -, *, /, or @)");
                isValid = false;
            }
        }while(!isValid);
        
    }
}
