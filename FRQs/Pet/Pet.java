
/**
 * Abstract class Pet - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Pet
{
    // instance variables - replace the example below with your own
    private String myName;
    
    public Pet(String name)
    {
        this.myName = name;
    }
    
    public String getName(){
        return this.myName;
    }
    
    public abstract String speak();
}
