import java.util.*;
public class P7C
{
    public P7C()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Num rows?: ");
        int numRows = input.nextInt();
        System.out.print("Num col?: ");
        int numCol = input.nextInt();
    
        int[][] myArray = new int[numRows][numCol];
        int columnCount = 0;
        int rowCount = 0;
        
        for(int i = 0; i < myArray.length; i++){
            
            for(int j = 0; j < myArray[0].length; j++){
                myArray[i][j] = (i+1) * (j+1);
            }
        }
        
        for(int[] i : myArray){
            for (int array : i){
                System.out.print(array + " ");
            }
            System.out.println();
        }
    }
}