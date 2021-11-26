import java.util.*;
import java.io.*;

public class Tester
{
    public Tester()
    {        
        try{
            File myFile = new File("MatrixData.txt");
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            
            myReader.close();
        }

        catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        /*
        int a[][] = new int[5][5];
        int b[][] = new int[4][2];
        
        int[][] c = MatrixMult.mult(a, b);
        
        for (int i = 0; i < a.length; i++){
            System.out.print("\n");
            for (int j = 0; j < b[0].length; j++){
                System.out.print(c[i][j] + " ");
            }
        }
        */
    }
}
