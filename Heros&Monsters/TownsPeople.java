public class TownsPeople implements Character
{
    // 3.Has a TownsPerson class defined to specifications.
    
    private int farmerNumber;
    private int randomNumberX;
    private int randomNumberY;
    
    private boolean hasVisited;
    private String name;
    
    private boolean isHidden;
    
    TownsPeople(Object[][] map)
    {
        randomNumberX = (int) (Math.random() * (9));
        randomNumberY = (int) (Math.random() * (9));
        
        // 9. Places each object in a unique random location on the map.
        while(map[randomNumberX][randomNumberY] != null){
            randomNumberX = (int) (Math.random() * (9));
            randomNumberY = (int) (Math.random() * (9));
        }
        map[randomNumberX][randomNumberY] = this;
        
        this.name = "F";
        
        hasVisited = false;
        isHidden = true;
    }
    
    public void setHasVisited(){
        this.hasVisited = true;
    }
    
    public boolean getHasVisited(){
        return this.hasVisited;
    }
    
    public void updateIsHidden(boolean hidden){
        this.isHidden = hidden;
    }
    
    public boolean getIsHidden(){
        return this.isHidden;
    }

    public int getXPos(){
        return this.randomNumberX;
    }

    public int getYPos(){
        return this.randomNumberY;
    }
    
    public String getName(){
        return this.name;
    }
}