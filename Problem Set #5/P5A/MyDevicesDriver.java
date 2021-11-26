import java.util.*;
public class MyDevicesDriver
{
    public MyDevicesDriver()
    {
        // MyDevice someDevice = new MyDevice(6, "White");
        MyPod pod = new MyPod(32, "Black");
        MyPhone phone = new MyPhone(16, "Blue", "AT&T");
        
        ArrayList<MyDevice> inventory = new ArrayList<MyDevice>();
        //inventory.add(someDevice);
        inventory.add(pod);
        inventory.add(phone);
        
        for(MyDevice device : inventory){
            System.out.println(device);
        }
    }
}
