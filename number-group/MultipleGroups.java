import java.util.*;
public class MultipleGroups
{
    private List<NumberGroup> groupList;
    
    public MultipleGroups()
    {
        
    }

    public boolean contains(int value){
        int number = 0;
        boolean containsOne = false;
        for(int i = 0; i < groupList.size(); i++){
            if (groupList.get(i).contains(value)){
                number +=1;
            }
        }
        if (number >= 1){
            containsOne = true;
        }
        return containsOne;
    }
}
