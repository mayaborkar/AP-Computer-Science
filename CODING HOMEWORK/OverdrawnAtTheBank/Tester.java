import java.util.Scanner;
public class Tester
{
    public static void main()
    {
        Scanner inputName = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = inputName.nextLine();
        
        Scanner inputBalance = new Scanner(System.in);
        System.out.print("Input your initial balance: ");
        double balance = inputBalance.nextDouble();
        
        BankAccount myAccount = new BankAccount(balance, name);
        
        double depositX = 505.22;
        myAccount.deposit(depositX);
        
        System.out.println(myAccount.balance);
        
        double withdrawX = 100;
        myAccount.withdraw(withdrawX);
        
        System.out.print(myAccount.printBalance());
    }

}
