import java.util.*;
public class BranchBanking
{
    ArrayList<Client> clientList = new ArrayList<Client>(); 
    public BranchBanking(ArrayList<Client> clients){
        for (Client item : clients) {
            clientList.add(item);
        }   
    }
    
    public double getMoney(){
        double totalMoney = 0;
        for(int i = 0; i < clientList.size(); i++){
            totalMoney += clientList.get(i).personalBalance + clientList.get(i).businessBalance;
        }
        return totalMoney;
    }
    
    public double totalPersonal(){
        double totalPersonal = 0;
        for(int i = 0; i < clientList.size(); i++){
            totalPersonal += clientList.get(i).personalBalance;
        }
        return totalPersonal;
    }
    
    public double totalBusiness(){
        double totalPersonal = 0;
        for(int i = 0; i < clientList.size(); i++){
            totalPersonal += clientList.get(i).businessBalance;
        }
        return totalPersonal;
    }
}
