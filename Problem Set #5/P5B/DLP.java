
public class DLP extends Television
{
    // instance variables - replace the example below with your own
    private String name;
    private double price;

    public DLP()
    {
        super("",0.0);
    }
    
    public DLP(String model, double cost){
        super(model, cost);
    }

    public String toString()
    {
        return super.toString();
    }
}
