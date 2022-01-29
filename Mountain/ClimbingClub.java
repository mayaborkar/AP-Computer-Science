import java.util.*;
public class ClimbingClub
{
    private List<ClimbInfo> climbList;
    
    public ClimbingClub()
    {
        climbList = new ArrayList<ClimbInfo>();
    }

    public void addClimb(String peakName, int climbTime){
        int index = 0;
        while(index < climbList.size() && climbList.get(index).getName().compareTo(peakName) < 0){
            index ++;
        }
        climbList.add(index, new ClimbInfo(peakName, climbTime));
    }
    
    public int distinctPeakNames(){
        if(climbList.size() == 0){
            return 0;
        }
        ClimbInfo currInfo = climbList.get(0);
        String currName = null;
        int numNames = 1;
        for(int k = 1; k < climbList.size(); k++){
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if (prevName.compareTo(currName) != 0){
                numNames++;
                prevName = currName;
            }
        }
        return numNames;
    }
    
    // i: Yes
    // ii: no
}
