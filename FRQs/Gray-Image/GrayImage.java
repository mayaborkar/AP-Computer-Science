public class GrayImage
{
    public static final int BLACK = 0;
    public static final int WHITE = 255;
    
    private int[][] pixelValues;
    
    public GrayImage()
    {
        
    }

    public int countWhitePixels()
    {
        int whiteCount = 0;
        for(int i = 0; i < pixelValues.length; i++){
            for(int j = 0; j < pixelValues[i].length; j++){

                if (pixelValues[i][j] == WHITE){
                    whiteCount += 1;
                }
            }
        }
        return whiteCount;
    }
    
    public void processImage(){
        for(int i = 0; i < pixelValues.length - 2; i++){
            for (int j = 0; j < pixelValues[i].length - 2; j++){
                if ((pixelValues[i][j] - pixelValues[i + 2][j + 2]) < BLACK){
                    pixelValues[i][j] = BLACK;
                }
                else if ((pixelValues[i][j] - pixelValues[i + 2][j + 2]) > BLACK){
                    pixelValues[i][j] = (pixelValues[i][j] - pixelValues[i + 2][j + 2]);
                }
                
            }
        }
    }
}
