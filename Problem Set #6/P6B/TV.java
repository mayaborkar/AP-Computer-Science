
/**
 * Abstract class TV - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class TV
{
    // instance variables - replace the example below with your own
    private int x;
    private boolean tvOn;
    
    // Getters and Setters
    public void setTVOn(boolean isOn)
    {
        this.tvOn = isOn;
    }
    
    public boolean getTVOn(){
        return this.tvOn;
    }
    
    public abstract String tvType();
}
