
/**
 * Write a description of class Automobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Automobile
{
    // instance variables - replace the example below with your own
    double mpg;
    double gallons;
    
    public Automobile(double milesPerGallon)
    {
        this.gallons = 0;
        this.mpg = milesPerGallon;
    }

    public void fillUp(double gasAdded)
    {
        this.gallons += gasAdded;
    }
    
    public void takeTrip(double milesTraveled)
    {
        this.gallons = gallons - (milesTraveled/mpg);
    }
    
    public double reportFuel()
    {
        return gallons;
    }
}
