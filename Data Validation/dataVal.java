import java.util.Scanner;
public class dataVal
{
    public static String getInput(String prompt){
        System.out.print(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void main(String args[])
    {
        // defining variables
        boolean isValid;
        String firstName;
        String lastName;
        String zipCode;
        int birthday;
        String phoneNum;
        String email;
        String username;
        String password;
        String newPassword;
        String checkPassword;
        String checkUsername;

        // making a new object of the scanner class called input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the \"Account Creator\"!");
        // get and check first name
        isValid = true;
        do{
            firstName = getInput("Input your first name (at least 2 letters and no numbers): ");
            if (!(allAlpha(firstName) >= 2 && isNumString(firstName) == 0)){
                System.out.println("\t Error! Your first name is not valid.");
                isValid = false;
            }
            else{
                // System.out.println("Your first name is valid");
                isValid = true;
            }
        } while (! isValid);

        // get and check last name
        isValid = true;
        do{
            lastName = getInput("Input your last name (at least 2 letters and no numbers): ");
            if (!(allAlpha(lastName) >= 2 && isNumString(lastName) == 0)){
                System.out.println("\t Error! Your last name is not valid.");
                isValid = false;
            }
            else{
                // System.out.println("Your last name is valid");
                isValid = true;
            }
        } while (! isValid);
        
        // get and check zip code
        isValid = true;
        do{
            zipCode = getInput("Input your zip code (must be all numbers and have 5 digits): ");
            if (validZip(zipCode) == true){
                // System.out.println("Your zip code is valid");
                isValid = true;
            }
            else{
                System.out.println("\t Error! Your zip code is not valid.");
                isValid = false;
            }
        } while (! isValid);
        
        // get and check birthday
        isValid = true;
        do{
            birthday = Integer.valueOf(getInput("Input the year you were born (YYYY, should be greater than 1905): "));
            if (validBirthday(birthday) == true){
                // System.out.println("Your birth year is valid");
                isValid = true;
            }
            else{
                System.out.println("\t Error! Your birth year is not valid.");
                isValid = false;
            }
        } while (! isValid);
        
        // get and check phone number
        isValid = true;
        do{
            phoneNum = getInput("Input your phone number (XXX-XXX-XXXX): ");
            if (validPhone(phoneNum) == true){
                // System.out.println("Your phone number is valid");
                isValid = true;
            }
            else{
                System.out.println("\t Error! Your phone number must be inputted with the following format: XXX-XXX-XXXX.");
                isValid = false;
            }
        } while (! isValid);
        
        // get and check email
        isValid = true;
        do{
            email = getInput("Input your email: ");
            if (isValidEmail(email) == true){
                // System.out.println("Your email is valid");
                isValid = true;
            }
            else{
                System.out.println("\t Error! Your email is not valid.");
                isValid = false;
            }
        } while (! isValid);
        
        // get username
        username = getInput("Input your username: ");
        // System.out.println(username);
        
        // get and check password
        isValid = true;
        do{
            password = getInput("Input your password (at least 8 characters, 2 numbers, 1 lower and 1 upper case letter): ");
            if (isValidPwd(password) == true){
                // System.out.println("Your password is valid");
                isValid = true;
            }
            else{
                System.out.println("\t Error! Your password is not valid.");
                isValid = false;
            }
        } while (! isValid);
        
        // re-enter password
        do{
            newPassword = getInput("Re-enter your password: ");
            if (password.equals(newPassword)){
                // System.out.println("Your password is valid");
                isValid = true;
            }
            else{
                System.out.println("\t Error! Your passwords do not match, please re-enter your password.");
                isValid = false;
            }
        } while (! isValid);
        
        System.out.println("** You have successfully created your account! **");
        
        // checking if username and password match
        
        isValid = true;
        do{
            checkUsername = getInput("Input your username: ");
            checkPassword = getInput("Input your password: ");
            if (username.equals(checkUsername) && password.equals(checkPassword)){
                isValid = true;
            }
            else{
                System.out.println("\t Error! Those credentials were not recognized.");
                isValid = false;
            }
        } while (! isValid);
        
        System.out.println("** You have successfully entered the system! **");

    }
    public static boolean validPhone(String str){
        boolean isValidPhone = false;
        if (str.length() == 12 &&
            str.substring(3, 4).equals("-") &&
            str.substring(7, 8).equals("-") && 
            isNumString(str.substring(0, 4)) == 3 && 
            isNumString(str.substring(4, 7)) == 3 && 
            isNumString(str.substring(8, 12)) == 4){
            isValidPhone = true;
        }
        return isValidPhone;
    }

    public static boolean validBirthday(int str){
        boolean valBirthday = false;
        if ((2021 - str) <= 116 && (str < 2021)){
            valBirthday = true;
        }
        return valBirthday;
    }

    public static boolean validZip(String str){
        boolean validZip = false;
        if (str.length() == 5 && isNumString(str) == 5){
            validZip = true;
        }
        return validZip;
    }

    public static boolean validateDomain(String domainName){
        boolean isValidDomain = false;
        char character;
        int valid;
        if (domainName.length() >= 2 && domainName.length() <= 63){
            for (int i = 0; i < domainName.length(); i++){
                character = domainName.charAt(i);
                valid = (int) character;
                if (!(( valid >= 64 && valid <= 122) || (valid >= 48 && valid <= 57))){
                    isValidDomain = false;
                }
                else{
                    isValidDomain = true;
                }
            }
        }
        return isValidDomain;
    }

    public static boolean isValidEmail(String str){
        boolean isValidEmail = false;
        int findAtSign = str.indexOf("@");
        if (findAtSign != -1 && findAtSign != 0){
            int findPeriod = str.indexOf(".", findAtSign);
            if (findPeriod != -1){
                String domainName = str.substring(findAtSign, findPeriod);
                isValidEmail = validateDomain(domainName);
            }
        }
        return isValidEmail;
    }

    public static boolean isValidPwd(String str){
        boolean isValid = false;
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            int count = (int) letter;
            if (count >= 65 && count <= 90){
                upperCount += 1;
            }
            if (count >= 97 && count <= 122){
                lowerCount += 1;
            }
        }
        if (str.length() >= 8 && isNumString(str) >= 2 && upperCount >= 1 && lowerCount >= 1){
            isValid = true;
        }
        return isValid;
    }

    public static int allAlpha(String str){
        // CHANGE ALLALPHA TO ASCII 
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            char ch2 = str.charAt(i);
            int asciiCh2 = (int) ch2;
            if (ch2 >= 65 && ch2 <= 122){
                counter += 1;
            }
            else{
                counter = 0;
                break;
            }
        }
        return counter;
    }

    public static int isNumString(String str){
        // CHANGE ISNUMSTRING TO ASCII 
        int countNum = 0;
        for (int i = 0; i < str.length(); i++){
            char ch1 = str.charAt(i);
            int asciiCh1 = (int) ch1;
            if (ch1 >= 48 && ch1 <= 57){
                countNum += 1;
            }
        }
        return countNum;
    }
}







