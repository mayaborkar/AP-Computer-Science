import java.util.*;
public class Weapon
{
    // 5.Has a Weapon class defined to specifications.
    
    // instance variables
    private int xPos;
    private int yPos;
    
    private String name;
    private int lowDamage;
    private int highDamage;
    
    private int currentDamage;
    
    public Weapon(String weaponName, int low, int high)
    {
        // initialise instance variables
        this.name = weaponName;
        this.lowDamage = low;
        this.highDamage = high;
        this.currentDamage = (int) (Math.random() * (this.highDamage - (this.lowDamage - 1) ) + this.lowDamage);
    }
    
    public int getXPos(){
        return this.xPos;
    }

    public int getYPos(){
        return this.yPos;
    }
    
    public void updateDamage(){
        this.currentDamage = (int) (Math.random() * (this.highDamage - (this.lowDamage - 1) ) + this.lowDamage);
    }
    
    public int getDamage(){
        return this.currentDamage;
    }
    
    
    
    public String getWeaponName(){
        return this.name;
    }
}