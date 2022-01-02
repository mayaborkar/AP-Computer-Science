public class MyPod extends MyDevice implements Discountable{
    public MyPod()
    {
        super();
    }

    public MyPod(int mem, String color)
    {
        super(mem, color);
    }
    
    public String connectToBluetooth(){
        return "Connecting to bluetooth for a MyPod";
    } 
    
    public String toString()
    {
        return super.toString();
    }
    
    public boolean isDiscount(){
        return true;
    }
}
