public class Tester
{
    public Tester()
    {
        int a[][] = new int[][]{ {1, 2, -2, 0},
                                 {-3, 4, 7, 2},
                                 {6, 0, 3, 1} };
        int b[][] = new int[][] { {-1, 3},
                                  {0, 9},
                                  {1, -11},
                                  {4, -5}};
        int[][] c = MatrixMult.mult(a, b);
        for (int i = 0; i < a.length; i++){
            System.out.print("\n");
            for (int j = 0; j < b[0].length; j++){
                System.out.print(c[i][j] + " ");
            }
        }
    }
}
