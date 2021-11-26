public class tester
{
    public static void main()
    {
      double d1 = 37.9; 
      double d2 = 1004.128;
      int i1 = 12;
      int i2 = 18;
      double problemOne = 57.2 * (i1 / i2) +1;
      double problemTwo = 57.2 * ( (double)i1 / i2 ) + 1;
      double problemThree = 15 - i1 * ( d1 * 3) + 4;
      int problemFour = 15 - i1 * (int)( d1 * 3) + 4;
      int problemFive = 15 - i1 * ( (int)d1 * 3) + 4;
      System.out.println("Problem 1: " + problemOne);
      System.out.println("Problem 2: " + problemTwo);
      System.out.println("Problem 3: " + problemThree);
      System.out.println("Problem 4: " + problemFour);
      System.out.println("Problem 5: " + problemFive);
    }
}
