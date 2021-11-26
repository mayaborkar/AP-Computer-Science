
/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car
{
    // instance variables - replace the example below with your own
    String carColor;
    int howFast;
    boolean hasFourDoors;

    public car()
    {
        carColor = "";
        howFast = 0;
        hasFourDoors = false;
    }
    
    public car(String color, int fast, boolean doors)
    {
        carColor = color;
        howFast = fast;
        hasFourDoors = doors;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        String str = "";
        str += "The color of your car is: " + carColor + "\n";
        str += "Your car goes " + howFast + " mph" + "\n";
        str += "Your car has four doors: " + hasFourDoors + "\n";
        return str;
    }
}
