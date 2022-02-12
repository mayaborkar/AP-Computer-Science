public class Robot
{
    private int[] hall;
    private int pos;
    private boolean facingRight;
    
    public Robot()
    {
        
    }

    private boolean forwardMoveBlocked()
    {
        if(facingRight && hall[pos + 1] != hall.length){
            return false;
        }
        
        else if(!facingRight && hall[pos] != hall[0]){
            return false;
        }
        
        else{
            return true;
        }
    }
    
    private void move(){
        while(hall[pos] > 0){
            hall[pos] -= 1;
        }
        
        if(!forwardMoveBlocked()){
            if(facingRight){
                pos +=1;
            }
            else{
                pos -=1;
            }
        }
        
        else{
            facingRight = !facingRight;
        }
    }
    
    public int clearHall(){
        int totalSum = 0;
        int moves = 0;
        do{
            for(int i = 0; i < hall.length; i++){
                totalSum += hall[i];
            }
            move();
            moves++;
        }while(totalSum != 0);
        return moves;
    }
    
    private boolean hallIsClear(){
        
    }
}
