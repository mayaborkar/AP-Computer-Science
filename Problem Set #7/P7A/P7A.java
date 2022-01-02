public class P7A
{
    
    public P7A()
    {
        int[][] myArray = new int[3][4];
        
        // Filling the array with random ints
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray[0].length; j++){
                int randomNumber =  (int) (Math.random() * 10); 
                myArray[i][j] = randomNumber;
            }
        }
        
        // Printing the array
        for(int i = 0; i < myArray.length; i++){ // row
            for(int j = 0; j < myArray[0].length; j++){ // column
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
