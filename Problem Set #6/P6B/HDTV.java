
/**
 * Write a description of class HDTV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HDTV extends TV implements Digital
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class HDTV
     */
    public HDTV()
    {
        // initialise instance variables
        x = 0;
    }

    public String connectHDMI(){
        return "HDMI cable connected";
    }
    
    public String tvType(){
        return "I'm a High Def 24 million color TV";
    }
}
