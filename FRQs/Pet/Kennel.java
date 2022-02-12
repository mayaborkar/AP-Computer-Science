import java.util.*;
public class Kennel
{
    private ArrayList petList;
    
    public Kennel()
    {
        
    }
    
    public void allSpeak(){
        for (int i; i < petList.size(); i++){
            System.out.println("Name: " + petList.get(i) + "\n Speak: "+ super.speak());
        }
    }
}
