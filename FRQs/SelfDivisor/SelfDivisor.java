import java.util.*;
public class SelfDivisor
{
    
    public SelfDivisor()
    {
        int[] selfDivisors = new int[3];
        selfDivisors = firstNumSelfDivisors(10,3);
        for (int i = 0; i < selfDivisors.length; i++){
            System.out.println(selfDivisors[i]);
        }
        
    }

    
    public static boolean isSelfDivisor(int number)
    {
        boolean isSelfDivisor = true;
        int length = (int) (Math.log10(number) + 1);
        int power = 0;
        int updatedNum = number;
        // System.out.println(length);
        for (int i = 1; i < length + 1; i++){
            power = (int) Math.pow(10, (length - i));
            // System.out.println(power);
            int numToCheck = (int)(updatedNum / power);
            // System.out.println(numToCheck);
            if ((numToCheck == 0) || (number % numToCheck != 0)){
                isSelfDivisor = false;
                break;
            }
            
            updatedNum = number % power;
        
            // System.out.println(updatedNum);
        }
        return isSelfDivisor;
    }
    
    public static int[] firstNumSelfDivisors(int start, int num){
        int[] selfDivisors = new int[num];
        int count = 0;
        for (int i = start; count < num; i++){
            if (isSelfDivisor(i)){
                selfDivisors[count] = i;
                count += 1;
            }
            
        }
        return selfDivisors;       
    }
}