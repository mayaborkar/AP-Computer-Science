public class MyDevice
{
    private int memory;
    private String color;
    
    public MyDevice()
    {
        this.memory = 8;
        this.color = "Black";
    }

    public MyDevice(int mem, String color)
    {
        this.memory = mem;
        this.color = color;
    }
    
    
    public String toString()
    {
        String str = "";
        str += "Memory capacity is: " + this.memory + "GB\n";
        str += "Color is: " + this.color + "\n";
        return str;
    }
}
