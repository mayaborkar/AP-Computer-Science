import java.util.List;
import java.util.ArrayList;
public class P3G
{
    public P3G()
    {
        ArrayList<String> colleges = new ArrayList<String>();
        colleges.add("UCLA");
        colleges.add("USC");
        colleges.add(null);
        colleges.add("Standford");
        colleges.remove(1);
        int nullCount = 0;
        colleges.add( 1, "Santa Clara" );
        System.out.println(colleges);
        for (int i = 0; i < colleges.size(); i++){
            System.out.println(colleges.get(i));
            if (colleges.get(i) == null){
                colleges.remove(colleges.get(i));
            }
        }
    }
}
