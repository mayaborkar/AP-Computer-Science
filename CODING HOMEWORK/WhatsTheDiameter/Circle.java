public class Circle
{
    //This part is called the constructor and lets us specify the radius of a //particular circle.
    public Circle(double r)
    {
        radius = r; 
    }
    //This is a method. It performs some action (in this case it calculates the //area of the circle and returns it.
    public double area( ) //area method
    {
        double a = Math.PI * radius * radius;
        return a; 
    }
    public double circumference( ) {
        double c = 2 * Math.PI * radius;
        return c; 
    }
    public double diameter(){
        double diameter = 2 * this.radius;
        return diameter;
    }
    public double radius;
}