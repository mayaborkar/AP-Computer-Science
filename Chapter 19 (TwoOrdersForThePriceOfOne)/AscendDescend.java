import java.util.*;
public class AscendDescend
{
    
    public static void main()
    {
        String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);
        System.out.println("Ascend \t\t\tDescend \n");
        for (int i = 0; i < ss.length; i++){
            System.out.print(ss[i]);
            System.out.println("\t\t\t" + ss[(ss.length - 1) -i]);
        }
    }
}
