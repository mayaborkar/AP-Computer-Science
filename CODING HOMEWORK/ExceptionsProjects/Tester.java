import java.util.*;
import java.io.*;
public class Tester
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        String fileName;
        do{
            try{
                System.out.println("Input your file name: ");
                fileName = input.nextLine();
                if(!(fileName.equals("exit"))){
                    FileInput.readTheFile(fileName);
                    System.out.println("It worked");
                    fileName = "exit";
                }
            }
            catch(IOException e){
                System.out.println("It did not work");
                fileName = "exit";
            }
        }while(!(fileName.equals("exit")));
    }
}
