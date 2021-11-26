public class P1G
{
    public static void main()
    {
        int[] myArray = new int[10];
        int j = 0;
        int count = 0;
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int)(Math.random() * 201) - 100;
        }
        // printing the array
        while (j < myArray.length){
            System.out.println(myArray[j]);
            j++;
        }
        System.out.println("\n");
        // adding 10 to each element in the array
        for (int i = 0; i < myArray.length; i++){
            myArray[i] += 10;
            System.out.println(myArray[i]);
        }
        // counting the number of positive integers in the array
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] > 0){
                count += 1;
            }
        }
        System.out.println("\n" + count);
    }
}
