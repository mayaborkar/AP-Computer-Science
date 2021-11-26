public class LED extends Television
{
    // instance variables - replace the example below with your own
    private String name;
    private double price;

    public LED()
    {
        super("",0.0);
    }
    
    public LED(String model, double cost){
        super(model, cost);
    }

    public String toString()
    {
        return super.toString();
    }
}
