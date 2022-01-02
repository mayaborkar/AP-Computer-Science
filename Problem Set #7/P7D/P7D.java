public class P7D
{
    public P7D()
    {
        char[][] myArray = new char[10][10];
        int count = 0;
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray[0].length; j++){
                count += 1;
                if(count > 90 || count < 65) count = 65;
                char convertedChar = (char) count;
                myArray[i][j] = convertedChar;
            }
        }
        
        for(char[] i : myArray){
            for (char array : i){
                System.out.print(array + " ");
            }
            System.out.println();
        }
    }
}
