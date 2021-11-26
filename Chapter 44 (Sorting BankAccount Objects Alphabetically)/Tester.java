import java.io.*;
import java.util.*;
import java.text.*; //for NumberFormat 
public class Tester
{
    public static void main(String args[]) {
        NumberFormat formatter = NumberFormat.getNumberInstance( ); 
        formatter.setMinimumFractionDigits(2); 
        formatter.setMaximumFractionDigits(2);
        String name;
        int j;
        // Create a BankAccount object array ba[ ], length 5 
        BankAccount ba[] = new BankAccount[5];
        for(j = 0; j < ba.length; j++)
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. "); 
            name = kbReader.nextLine( );
            System.out.print("Please enter the amount of the deposit. "); 
            double amount = kbReader.nextDouble( ); 
            System.out.println(" "); //gives a blank line between accounts
            // Instantiate object ba[j] using name and amount
            ba[j] = new BankAccount(name, amount);
        }
        // Sort the ba array using the sort method in the Arrays class
        Comparator comp = new SortbyName();
        
        
        Arrays.sort(ba, comp);
        
        // Print the ordered array in this format Harry Houdini >>> 298.44
        for(int i = 0; i < ba.length; i++){
            System.out.println(ba[i].name + " >>> " + ba[i].balance);
        }
    } 
}