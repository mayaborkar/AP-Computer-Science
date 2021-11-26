public class Client
{
    String firstName;
    String lastName;
    String userName;
    String password;
    double personalBalance;
    double businessBalance;
    
    public Client(String fName, String lName, String uName, String pass, double perBal, double busBal)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.userName = uName;
        this.password = pass;
        this.personalBalance = perBal;
        this.businessBalance = busBal;
    }
    
    public void personalWithdraw(double amount){
        if(amount > this.personalBalance){
            System.out.println("You do not have enough money for this transaction. ");
        }
        else{
            this.personalBalance -= amount;
        }
        
    }
    
    public void personalDeposit(double amount){
        this.personalBalance += amount;
    }
    
    public void businessWithdraw(double amount){
        if(amount > this.businessBalance){
            System.out.println("You do not have enough money for this transaction. ");
        }
        else{
            this.businessBalance -= amount;
        }
    }
    
    public void businessDeposit(double amount){
        this.businessBalance += amount;
    }
}
