public class College
{
    public College()
    {
        String[] name = new String[3];
        name[0] = "UCLA";
        name[1] = "USC";
        name[2] = "UCSD";
        
        String minName = name[0];
        
        
        for (int i = 0; i < name.length - 1; i++){
            System.out.println(name[i].length());
            System.out.println(name[i]);
            if (name[i].length() < name[i+1].length()){
                minName = name[i];
            }
        }
        System.out.println(minName + "\n");
        name[2] = null;
        for (int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
    }
}
