import java.util.*;
public class MyDevicesDriver
{
    public MyDevicesDriver()
    {
        // MyDevice someDevice = new MyDevice(6, "White");
        MyPod pod = new MyPod(32, "Black");
        MyPhone phone = new MyPhone(16, "Blue", "AT&T");
        MyCar car = new MyCar("Grey", "Ford");
        
        ArrayList<Connectable> inventory = new ArrayList<Connectable>();
        //inventory.add(someDevice);
        inventory.add(pod);
        inventory.add(phone);
        inventory.add(car);
        
        
        for(Connectable device : inventory){
            System.out.println(device.connectToBluetooth());
        }
        
    }
}
