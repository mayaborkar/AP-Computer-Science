import java.util.*;
public class teachers
{
    
    public teachers()
    {
        ArrayList <String> teachers = new ArrayList<String>(5);
        teachers.add("Mr.Lee");
        teachers.add("Mrs.Leong");
        teachers.add("Ms.Cobos");
        teachers.add("Ms.Chubbuck");
        teachers.add("Ms.Chang");
        for (int i = 0; i < teachers.size(); i++){
            System.out.println(teachers.get(i));
        }
    }
}
