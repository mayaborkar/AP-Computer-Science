public class SkyView
{
    private double[][] view;
    
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        for (int i = 0; i < view.length; i++){
            for (int j = 0; j < view[i].length; j++){
                System.out.print(view[i][j]);
            }
            System.out.println();
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        int sum = 0;
        for (int i = startRow; i < endRow; i++){
            for (int j = startCol; j < endCol; j++){
                sum += view[i][j];
            }
        }
        return sum / 4;
    }
}
