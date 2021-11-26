
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    // instance variables - replace the example below with your own
    double balance;
    String name;

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount(double yourBalance, String yourName)
    {
        balance = yourBalance;
        name = yourName;
    }

    public void deposit(double x)
    {
        this.balance += x;
    }
    
    public void withdraw(double y)
    {
        this.balance -= y;
    }
    
    public String printBalance(){
        String str = "";
        str = "The " + name + " account balance is, $" + this.balance;
        return str;
    }
}
