import java.util.*;
public class P7D
{
    public P7D()
    {
        // Creating the array
        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int rowCount = input.nextInt();
        System.out.println("Enter the number of columns: ");
        int columnCount = input.nextInt();
        char[][] myArray = new char[rowCount][columnCount];
        
        System.out.println("Do you wish to print lowercase letters(a-z), capital letters(A-Z), or digits(0-9)?");
        String yourInput = stringInput.nextLine();
        int min = 0;
        int max = 0;
        if (yourInput.equals("lowercase")){
            min = 97;
            max = 122;
        }
        
        else if(yourInput.equals("capital")){
            min = 65;
            max = 90;
        }
        
        else if(yourInput.equals("digits")){
            min = 48;
            max = 57;
        }
        int count = 0;
        
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray[0].length; j++){
                count += 1;
                if(count > max || count < min) count = min;
                char convertedChar = (char) count;
                myArray[i][j] = convertedChar;
            }
        }
        
        for(char[] i : myArray){
            for (char array : i){
                System.out.print(array + " ");
            }
            System.out.println();
        }
    }
}
