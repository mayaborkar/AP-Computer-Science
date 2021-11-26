import java.util.*;
public class Driver
{
    boolean isATM = true;
    public Driver()
    {
        ArrayList<String> newClients = new ArrayList<String>();
        
        newClients.add("Dan Lee d l 42000.01 78000.12");
        newClients.add("Ted Lee d l 40200.01 70800.12");
        newClients.add("Red Lee d l 40020.01 70080.12");
        newClients.add("Phil Lee d l 40002.01 70008.12");
        
        newClients.add("Ben Lee d l 43000.01 73000.12");
        newClients.add("Yul Lee d l 40300.01 70300.12");
        newClients.add("Luk Lee d l 40030.01 70030.12");
        newClients.add("Fred Lee d l 40003.01 70003.12");
        
        newClients.add("Ned Lee d l 47000.01 76000.12");
        newClients.add("Wen Lee d l 40700.01 70600.12");
        newClients.add("Mo Lee d l 40070.01 70060.12");
        newClients.add("Nell Lee d l 40007.01 70006.12");
        
        newClients.add("Gad Lee d l 49000.01 74000.12");
        newClients.add("Ill Lee d l 40900.01 70400.12");
        newClients.add("Pill Lee d l 40090.01 70040.12");
        newClients.add("Dill Lee d l 40009.01 70004.12");
        
        CorporateOffice corp = new CorporateOffice(newClients);
            
        
        

        
        do{
        System.out.println("** Welcome to the Bank! **\n");
            
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String user = input.nextLine();
        System.out.print("Enter your password: ");
        String password = input.nextLine();
        
        
        if (user.equals("-1") && password.equals("-1")){
            processRegionalManager(corp); 
        }
        else{
            Client c = corp.getClient(user, password);
            if(c != null){
                processClient(corp, c);
            }
            else{
                System.out.println("Error those credentials are not in the system. ");
            }
        }
        }while(isATM == true);
    }
    
    public void processRegionalManager(CorporateOffice corp){
        String option;
        do{
        Scanner input = new Scanner(System.in);
        System.out.print("\n** Regional Manager Account **\n");
        System.out.print("1.Print out all client information.\n2.Print out all business account information.\n3.Print out all personal account information.\n4.Print out whether a monthly profit was earned.\n5.Print out whether a monthly profit was earned through Personal Banking.\n6.Print out whether a monthly profit was earned through Business Banking.\n7.Exit\n");
        System.out.print("Choose an option: ");
        option = input.nextLine();
        
        if(option.equals("1")){
            corp.publishClientInfo();
        }
        else if(option.equals("2")){
            corp.publishBusinessBalance();
        }
        else if(option.equals("3")){
            corp.publishPersonalBalance();
        }
        else if(option.equals("4")){
            System.out.println("A monthly profit was earned: " + corp.checkProfit());
        }
        else if(option.equals("5")){
            System.out.println("A monthly profit was earned through Personal Banking: " + corp.checkPersonalProfit());
        }
        else if(option.equals("6")){
            System.out.println("A monthly profit was earned through Business Banking: " + corp.checkBusinessProfit());
        }
        else if(option.equals("7")){
            System.out.println("** Thank You! **\n");
            // exit system
        }
        else{
            System.out.print("Error! Enter a number from 1-6.");
        }
        }while(! option.equals("7"));
    }
    
    public void processClient(CorporateOffice corp, Client c){
        String option;
        do{
        Scanner input = new Scanner(System.in);
        Scanner amount = new Scanner(System.in);
        System.out.println("1. Make a deposit into Personal bank account. \n2. Make a withdrawal from your Personal bank account. \n3. View your Personal bank account balance. \n4. Make a deposit into Business bank account. \n5. Make a withdrawal from your Business bank account. \n6. View your Business bank account balance. \n7. Exit the system. \n");
        System.out.print("Choose an option: ");
        option = input.nextLine();
        
        if(option.equals("1")){
            System.out.print("How much money would you like to deposit? ");
            double pAmount = amount.nextDouble();
            c.personalDeposit(pAmount);
        }
        else if(option.equals("2")){
            System.out.print("How much money would you like to withdraw? ");
            double pWAmount = amount.nextDouble();
            c.personalWithdraw(pWAmount);
        }
        else if(option.equals("3")){
            System.out.print("Your personal balance is now " + c.personalBalance);
        }
        else if(option.equals("4")){
            System.out.print("How much money would you like to deposit? ");
            double bAmount = amount.nextDouble();
            c.businessDeposit(bAmount);      
        }
        else if(option.equals("5")){
            System.out.print("How much money would you like to withdraw? ");
            double bWAmount = amount.nextDouble();
            c.businessWithdraw(bWAmount);  
        }
        else if(option.equals("6")){
           System.out.print("Your business balance is now " + c.businessBalance);    
        }
        else if(option.equals("7")){
            System.out.println("** Thank You! **\n");
            // exit system
        }
        else{
            System.out.print("Error! Enter a number from 1-6.");
        }
        }while(! option.equals("7"));
    }
}


