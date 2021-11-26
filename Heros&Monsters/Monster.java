public class Monster implements Character
{
    // 6.Has a Monster class defined to specifications.
    
    private int randomNumberX;
    private int randomNumberY; 
    
    private int randomAttack;
    private int randomSpeed;
    private int randomHealth;
    
    private String name;
    
    private boolean isHidden;
    
    public Monster(Object[][] map){
        randomNumberX = (int) (Math.random() * (9));
        randomNumberY = (int) (Math.random() * (9));
        
        // 9. Places each object in a unique random location on the map.
        while(map[randomNumberX][randomNumberY] != null){
            randomNumberX = (int) (Math.random() * (9));
            randomNumberY = (int) (Math.random() * (9));
        }
        map[randomNumberX][randomNumberY] = this;
        
        randomAttack = (int) ((Math.random() * 30) + 1); // 1-30
        randomSpeed = (int) ((Math.random() * 3) + 1);
        randomHealth = (int) ((Math.random() * 101) + 1); // 1-100
        
        this.name = "M";
        
        isHidden = true;
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
    
    public int setMonsterHealth(int health)
    {
        this.randomHealth += health;
        return this.randomHealth;
    }
    
    public int getMonsterHealth(){
        return this.randomHealth;
    }
    
    public int getSpeed(){
        return this.randomSpeed;
    }
    
    public int getAttackValue(){
        return this.randomAttack;
    }
    
    public String getName(){
        return this.name;
    }
}