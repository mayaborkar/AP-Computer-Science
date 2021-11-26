import java.util.*;
public class Tester {
    public Tester() {
        Random obj = new Random();
        int r;
        for (int i = 0; i <= 33; i ++){
            r = 71 + obj.nextInt(99-71 + 1);
            System.out.println(r);
        }
    }
} 