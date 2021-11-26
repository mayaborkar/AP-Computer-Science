public class Schools
{
    public Schools()
    {
        String school1 = new String ("Stanford");
        String school2 = new String ("UT Austin");
        String school3 = new String ("UCLA");
          
        System.out.println( school1.compareTo( school2 ));
        System.out.println( school2.compareTo( school3 ));
        
        // Since school 1 alphabetically preceeds school 2 it returns a negative int, returns negative
        // 2 because the ascii value of S is 115 and the ascii value of U is 117 so 115-117 is -2
        
    }
}
