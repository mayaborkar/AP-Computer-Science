public class MyPhone extends MyDevice
{
    private String serviceProvider;
    
    public MyPhone()
    {
        super();
        this.serviceProvider = "none";
    }

    public MyPhone(int mem, String color, String provider)
    {
        super(mem, color);
        this.serviceProvider = provider;
    }
    
    
    public String toString()
    {
        String str = "";
        str += super.toString();
        str += "Carrier is: " + this.serviceProvider + "\n";
        return str;
    }
}
