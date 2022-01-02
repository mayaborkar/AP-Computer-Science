public class MyCar extends Vehicle implements Discountable, Connectable
{
    private String carColor;
    private String carModel;
    
    public MyCar(String color, String model)
    {
        this.carColor = color;
        this.carModel = model;
    }
    
    public boolean isDiscount(){
        return false;
    }
    
    public String connectToBluetooth(){
        return "Connecting to bluetooth for a MyCar";
    } 
}
