import java.util.*;
public class CorporateOffice
{
    private ArrayList<BranchBanking> branchList = new ArrayList<BranchBanking>();
        
        
    public CorporateOffice(ArrayList<String> clients)
    {
        ArrayList<Client> clientList = new ArrayList<Client>();
        
        String firstName;
        String lastName;
        String userName;
        String password;
        double personalBalance;
        double businessBalance;
        
        for(int i = 0; i < 4; i++){
            String clientInfo[] = clients.get(i).split(" ");
            firstName = clientInfo[0];
            lastName = clientInfo[1];
            userName = clientInfo[2];
            password = clientInfo[3];
            personalBalance = Double.valueOf(clientInfo[4]);
            businessBalance = Double.valueOf(clientInfo[5]);
            
            clientList.add(new Client(firstName, lastName, userName, password, personalBalance, businessBalance));
        }
        branchList.add(new BranchBanking(clientList));
        clientList.clear();
        
        for(int i = 4; i < 8; i++){
            String clientInfo[] = clients.get(i).split(" ");
            firstName = clientInfo[0];
            lastName = clientInfo[1];
            userName = clientInfo[2];
            password = clientInfo[3];
            personalBalance = Double.valueOf(clientInfo[4]);
            businessBalance = Double.valueOf(clientInfo[5]);
            
            clientList.add(new Client(firstName, lastName, userName, password, personalBalance, businessBalance));
        }
        branchList.add(new BranchBanking(clientList));
        clientList.clear();
        
        for(int i = 8; i < 12; i++){
            String clientInfo[] = clients.get(i).split(" ");
            firstName = clientInfo[0];
            lastName = clientInfo[1];
            userName = clientInfo[2];
            password = clientInfo[3];
            personalBalance = Double.valueOf(clientInfo[4]);
            businessBalance = Double.valueOf(clientInfo[5]);
            
            clientList.add(new Client(firstName, lastName, userName, password, personalBalance, businessBalance));
        }
        branchList.add(new BranchBanking(clientList));
        clientList.clear();
        
        for(int i = 12; i < 16; i++){
            String clientInfo[] = clients.get(i).split(" ");
            firstName = clientInfo[0];
            lastName = clientInfo[1];
            userName = clientInfo[2];
            password = clientInfo[3];
            personalBalance = Double.valueOf(clientInfo[4]);
            businessBalance = Double.valueOf(clientInfo[5]);
            
            clientList.add(new Client(firstName, lastName, userName, password, personalBalance, businessBalance));
        }
        branchList.add(new BranchBanking(clientList));
        clientList.clear();
        
    }

    
    public Client getClient(String username, String password){
        Client selectedClient = null;
        for(BranchBanking branch :  branchList){
            for(Client branchClients : branch.clientList){
                // System.out.println(branchClients.firstName);
                if(branchClients.userName.equals(username)){
                    // System.out.println("Found username match");
                    if(branchClients.password.equals(password)){
                        selectedClient = branchClients;
                    }
                }
            }
            // System.out.println("end of branch");
        }
        
        return selectedClient;
    }
    
    
    public void publishClientInfo(){
       for(BranchBanking branch :  branchList){
            for(Client branchClients : branch.clientList){
                System.out.println(branchClients.firstName + " " + branchClients.lastName + " (Personal Balance): $" + branchClients.personalBalance);
                System.out.println(branchClients.firstName + " " + branchClients.lastName + " (Business Balance): $" + branchClients.businessBalance + "\n");
            }
        } 
    }
    
    public void publishBusinessBalance(){
       for(BranchBanking branch :  branchList){
            for(Client branchClients : branch.clientList){
                System.out.println(branchClients.firstName + " " + branchClients.lastName + " (Business Balance): $" + branchClients.businessBalance);
            }
        } 
    }
    
    public void publishPersonalBalance(){
       for(BranchBanking branch :  branchList){
            for(Client branchClients : branch.clientList){
                System.out.println(branchClients.firstName + " " + branchClients.lastName + " (Personal Balance): $" + branchClients.personalBalance);
            }
        } 
    }
    
    // Calculating monthly profit for Corporate office
    public boolean checkProfit()
    {
        double totalMoney = 0; // add all monies across all branches
        for(BranchBanking branch :  branchList){
            totalMoney += branch.getMoney();
        }
        // checking for profitability on a monthly basis 
        // hence divided annual by 12
        double totalMonthlyIncome = (totalMoney * 0.05)/12;
        double totalMonthlyExpense = 7000;
        if((totalMonthlyExpense) - (totalMonthlyIncome) > 0)
        {
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean checkPersonalProfit()
    {
        double totalMoney = 0; // add all monies across all branches
        for(BranchBanking branch :  branchList){
            totalMoney += branch.totalPersonal();
        }
        
        double totalMonthlyIncome = (totalMoney * 0.05)/12;
        double totalMonthlyExpense = 0.4 * 7000;
        
        if((totalMonthlyExpense) - (totalMonthlyIncome) > 0)
        {
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean checkBusinessProfit()
    {
        double totalMoney = 0; // add all monies across all branches
        for(BranchBanking branch :  branchList){
            totalMoney += branch.totalBusiness();
        }
        
        double totalMonthlyIncome = (totalMoney * 0.05)/12;
        double totalMonthlyExpense = 0.6 * 7000;
        
        if((totalMonthlyExpense) - (totalMonthlyIncome) > 0)
        {
            return false;
        }
        else{
            return true;
        }
    }
}
