public class Potion implements Character
{
    // 7.Has a Potion class defined to specifications.
    
    // instance variables - replace the example below with your own
    private int randomNumberX;
    private int randomNumberY;
    
    private int numberOfPotions;
    private String name;

    private boolean isHidden;

    
    public Potion(Object[][] map)
    {
        randomNumberX = (int) (Math.random() * (9));
        randomNumberY = (int) (Math.random() * (9));
        
        // 9. Places each object in a unique random location on the map.
        while(map[randomNumberX][randomNumberY] != null){
            randomNumberX = (int) (Math.random() * (9));
            randomNumberY = (int) (Math.random() * (9));
        }
        map[randomNumberX][randomNumberY] = this;
        
        this.numberOfPotions = 0;
        this.name = "P";
        
        isHidden = true;
    }
    
    public void updateIsHidden(boolean hidden){
        this.isHidden = hidden;
    }
    
    public boolean getIsHidden(){
        return this.isHidden;
    }
    
    public void setXPos(int updateX){
        this.randomNumberX += updateX;
    }
    
    public int getXPos(){
        return this.randomNumberX;
    }
    
    public void setYPos(int updateY){
        this.randomNumberY += updateY;
    }
    
    public int getYPos(){
        return this.randomNumberY;
    }
    
    public String getName(){
        return this.name;
    }
}