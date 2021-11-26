import java.util.Scanner;
public class Tester
{
    public Tester()
    {
        String str;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Type in a sentence and press ENTER. ");
            str = input.nextLine();
            str = str.toUpperCase();
            if (! str.equals("EXIT")){
                str += "1234";
                str = str.replace(" ", "");
                System.out.print(str);
                String[] sp = str.split("SA");
                System.out.println("There are " + (sp.length - 1) + " occurences");
            }
            
        }while(! str.equals("EXIT"));
    }
}
