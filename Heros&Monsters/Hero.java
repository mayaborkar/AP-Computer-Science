public class Hero implements Character
{
    // 2. Has a Hero class defined to specifications.
    
    // instance variables
    private String name;
    private int xPos;
    private int yPos;
    private int health;
    private int monstersKilled;
    private int numberOfPotions;
    private int potionsInteracted;
    private Weapon sword;
    private boolean armor;
    private int farmerNumber;
    private int monstersEncountered;
    
    private boolean isHidden;
    
    public Hero()
    {
        this.xPos = 9;
        this.yPos = 0;
        this.health = 100;
        this.sword = new Weapon("dagger", 10, 30);
        this.armor = false;
        this.name = "H";
        
        isHidden = false;
    }
    
    public void updateIsHidden(boolean hidden){
        this.isHidden = hidden;
    }
    
    public boolean getIsHidden(){
        return this.isHidden;
    }
    
    public void updateHealth(int change){
        this.health += change;
    }
    // Health
    public void setHealth(int whatHealth){
        this.health = whatHealth;
    }
   
    public int getHealth(){
        return this.health;
    }
    // X position
    public void setXPos(int updateX){
        this.xPos += updateX;
    }
    
    public int getXPos(){
        return this.xPos;
    } 
    // y position
    public void setYPos(int updateY){
        this.yPos += updateY;
    }

    public int getYPos(){
        return this.yPos;
    }
    
    public void updateMonstersKilled(int numKilled){
        this.monstersKilled += numKilled;
    }
    
    public int getMonstersKilled(){
        return this.monstersKilled;
    }
    
    public int potionsInteracted(){
        this.potionsInteracted += 1;
        return this.potionsInteracted;
    }
    
    public void setNumberOfPotions(int change){
        this.numberOfPotions += change;
    }
    
    public int getNumberOfPotions(){
        return this.numberOfPotions;
    }
    
    public int getSwordDamage(){
        this.sword.updateDamage();
        return this.sword.getDamage();
    }
    
    public String getSwordName(){
        return this.sword.getWeaponName();
    }
    
    public void setSword(String name, int low, int high){
        this.sword = new Weapon(name, low, high);
    }
    
    public void setHasArmor(boolean has){
        this.armor = has;
    }
    
    public boolean hasArmor(){
        return this.armor;
    }
    
    public void setFarmerNumber(int count){
        this.farmerNumber += count;
    }
    
    public int getFarmerNumber(){
        return this.farmerNumber;
    }
    
    public void updateMonstersEncountered(int change){
        this.monstersEncountered += change;
    }
    
    public int getMonstersEncountered(){
        return this.monstersEncountered;
    }
    
    public String getName(){
        return this.name;
    }
}