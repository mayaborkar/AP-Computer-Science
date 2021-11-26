import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class College
{
    public College()
    {
        ArrayList<String> collegeList = new ArrayList<String>();
        
        collegeList.add("Stanford");
        collegeList.add("UCLA");
        collegeList.add("UCSB");
        collegeList.add("PCC");
        collegeList.add("UCSC");
        collegeList.add("UCLA");
        collegeList.add("USC");
        collegeList.add("UMass");
        collegeList.add("Army");
        collegeList.add("Navy");
        

        for (int i = 0; i < collegeList.size(); i++){
            System.out.println(collegeList.get(i));
        }
        /*
        for (int i = 0; i < collegeList.size(); i++){
            if(collegeList.get(i).length() == 4){
                collegeList.remove(i);
                i--;
            }
        }
        */
        
        for (Iterator<String> myCollege = collegeList.iterator(); myCollege.hasNext(); ){
            String value = myCollege.next();
            if(value.length() == 4){
                myCollege.remove();
            }
        }
        
        System.out.println("----");
        
        for (int i = 0; i < collegeList.size(); i++){
            System.out.println(collegeList.get(i));
        }
    }
}
