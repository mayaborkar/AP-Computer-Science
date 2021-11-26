import java.util.*;
public class Tester {
    public Tester() {
        Random obj = new Random();
        double r;
        double min = 99.78;
        double max = 147.22000000000001;
        // 100.28789924214661
        for (int i = 0; i <= 27; i ++){
            r = min + obj.nextDouble() * (max - min);
            System.out.println(r);
        }
    }
} 