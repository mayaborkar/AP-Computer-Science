public class LCD extends Television
{
     // instance variables - replace the example below with your own
    private String name;
    private double price;

    public LCD()
    {
        super("",0.0);
    }
    
    public LCD(String model, double cost){
        super(model, cost);
    }

    public String toString()
    {
        return super.toString();
    }
}
