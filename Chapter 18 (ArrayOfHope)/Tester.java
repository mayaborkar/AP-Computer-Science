public class Tester
{
    
    public static void main()
    {
        char ch[] = new char[26];
        for (int i = 65; i <= 90; i++){
            ch[i - 65] = (char)i;
        }
        
        for (int i = 0; i < 26; i ++){
            if (i == 25){
                System.out.print(ch[i]);
            }
            else System.out.print(ch[i] + ", ");
        }
    }

}
