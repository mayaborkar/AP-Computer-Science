public class Plasma extends Television
{
    // instance variables - replace the example below with your own
    private String name;
    private double price;

    public Plasma()
    {
        super("",0.0);
    }
    
    public Plasma(String model, double cost){
        super(model, cost);
    }

    public String toString()
    {
        return super.toString();
    }
}
