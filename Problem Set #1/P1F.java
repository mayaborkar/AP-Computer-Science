public class P1F
{
    public static void main()
    {
        int[] myArray = new int[10];
        int sum = 0;
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int)(Math.random() * 101);
        }
        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        System.out.println("\n" + sum);
        for (int i = myArray.length - 1; i >= 0; i--){
            System.out.print(myArray[i] + " ");
        }
    }
}
