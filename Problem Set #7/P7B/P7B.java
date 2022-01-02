public class P7B
{
    
    public P7B()
    {
        int[][] myArray = new int[3][5];
        int count = 0;
        int sum = 0;
        
        int columnCount1 = 0;
        int columnCount2= 0;
        int columnCount3 = 0;
        int columnCount4 = 0;
        int columnCount5 = 0;
        
        int rowCount1 = 0;
        int rowCount2 = 0;
        int rowCount3 = 0;
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray[0].length; j++){
                 
                count += 1;
                sum += count;
                
                myArray[i][j] = count;
                // System.out.println(myArray[i][j]);
                if(j == 0){
                    columnCount1 += myArray[i][j];
                }
                
                else if(j == 1){
                    columnCount2 += myArray[i][j];
                }
                else if(j == 2){
                    columnCount3 += myArray[i][j];
                }
                else if(j == 3){
                    columnCount4 += myArray[i][j];
                }
                else if( j == 4){
                    columnCount5 += myArray[i][j];
                }
                
                if(i == 0){
                    rowCount1 += myArray[i][j];
                }
                
                else if(i == 1){
                    rowCount2 += myArray[i][j];
                }
                else if(i == 2){
                    rowCount3 += myArray[i][j];
                }
            
                System.out.println(myArray[i][j]);
            }
        }
        
        for(int[] i : myArray){
            for (int array : i){
                System.out.print(array + " ");
            }
            System.out.println();
        }
        
        System.out.println("Sum of total: "  + sum);
        
        System.out.println("Sum of column 1: " + columnCount1);
        System.out.println("Sum of column 2: " + columnCount2);
        System.out.println("Sum of column 3: " + columnCount3);
        System.out.println("Sum of column 4: " + columnCount4);
        System.out.println("Sum of column 5: " + columnCount5);
        
        System.out.println("Sum of row 1: " + rowCount1);
        System.out.println("Sum of row 2: " + rowCount2);
        System.out.println("Sum of row 3: " + rowCount3);
    }
}
