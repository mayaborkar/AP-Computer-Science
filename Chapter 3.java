public class Celeb
{
    static void newString(String yourStr){
        System.out.println(yourStr + ">>>" + yourStr.substring(2, yourStr.length() - 3));
    }
    public static void main()
    {
        newString("Allan Alda");
        newString("John Wayne");
        newString("Gregory Peck");
    }
}
