import java.io.*;
import java.util.*; 
public class Tester
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in); 
        System.out.print("Enter a sentence that is to be encrypted: "); 
        String sntnc = kbReader.nextLine( ); 
        System.out.println("Original sentence = " + sntnc);
        
        Crypto myCryptObj = new Crypto( );
        String encryptdSntnc = myCryptObj.encrypt(sntnc); 
        System.out.println("Encrypted sentence = " + encryptdSntnc);
        
        String decryptdSntnc = myCryptObj.decrypt(encryptdSntnc);
        System.out.println("Decrypted sentence = " + decryptdSntnc); 
    }
}