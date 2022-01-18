import java.util.*;
public class Trail
{
    private int[] markers = new int[13];
    public Trail(){
        markers[0] = 100;
        markers[1] = 150;
        markers[2] = 105;
        markers[3] = 120;
        markers[4] = 90;
        markers[5] = 80;
        markers[6] = 50;
        markers[7] = 75;
        markers[8] = 75;
        markers[9] = 70;
        markers[10] = 80;
        markers[11] = 90;
        markers[12] = 100;
        
        System.out.println(isLevelTrailSegment(2, 12));
        
        System.out.println(isDifficult());
    }

    public boolean isLevelTrailSegment(int start, int end){
        boolean isLevel = false;
        
        int min = markers[start];
        int max = markers[start];
        
        for (int i = start; i < end; i++){
            if (markers[i] <= min){
                min = markers[i];
            }
            
            if (markers[i] >= max){
                max = markers[i];
            }
        }
        
        System.out.println(min);
        System.out.println(max);
        
        if ((max - min) < 10){
            isLevel = true;
        }
        return isLevel;
    }
    
    public boolean isDifficult(){
        int difficultCount = 0;
        boolean isDifficult = false;
        
        for(int i = 0; i < markers.length; i++){
            if(Math.abs(markers[i] - markers[i+1]) >= 30){
                difficultCount += 1;
            }
            
            if (difficultCount >= 3){
                isDifficult = true;
                break;
            }
        }
        
        return isDifficult;
    }
}