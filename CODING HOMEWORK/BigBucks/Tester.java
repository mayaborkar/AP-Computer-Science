import java.io.*;
import java.util.*; //includes ArrayList 
import java.text.*; //for NumberFormat 
public class Tester
{
    public static void main(String args[])
    {
    NumberFormat formatter = NumberFormat.getNumberInstance( );
    formatter.setMinimumFractionDigits(2); 
    formatter.setMaximumFractionDigits(2);
    String name;
    //Instantiate an ArrayList object here called aryList 
    ArrayList<BankAccount> aryList = new ArrayList<BankAccount>();
    do
    {
        Scanner kbReader = new Scanner(System.in); 
        System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort)");
        name = kbReader.nextLine( );
        
        if( !name.equalsIgnoreCase("EXIT") ){
            
            System.out.print("Please enter the amount of the deposit. "); 
            double amount = kbReader.nextDouble(); 
            System.out.println(" ");
            
            BankAccount bank = new BankAccount(name, amount);
            aryList.add(bank);
        } 
    } while(!name.equalsIgnoreCase("EXIT"));
    //Search aryList and print out the name and amount of the largest bank account 
    BankAccount ba = aryList.get(0);
    double maxBalance = ba.balance;
    String maxName = ba.name;
    for(int j = 1; j < aryList.size( ); j++)
    {
        if (maxBalance <= aryList.get(j).balance){
            maxBalance = aryList.get(j).balance;
            maxName = aryList.get(j).name;
        }
    }
    System.out.println("The account with the largest balance belongs to " + maxName);
    System.out.println("The amount is $" + maxBalance);
    } 
        
}