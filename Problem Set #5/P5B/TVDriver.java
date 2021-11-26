import java.util.*;
public class TVDriver
{
    public TVDriver()
    {
        System.out.println("TVs in store...");
        DLP dlp1 = new DLP("Silver", 59.99);
        LCD lcd1 = new LCD("Gold", 199.99);
        LED led1 = new LED("Platinum", 399.99);
        Plasma plasma1 = new Plasma("Sapphire", 499.99);
        ArrayList<Television> myTV = new ArrayList<Television>();
        myTV.add(dlp1);
        myTV.add(lcd1);
        myTV.add(led1);
        myTV.add(plasma1);
        for(Television tv : myTV){
            System.out.println(tv);
        }
        //System.out.println("hello");
    }
}
