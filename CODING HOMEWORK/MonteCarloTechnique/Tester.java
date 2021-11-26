public class Tester
{
    
    public static void main()
    {
        MonteCarlo mcObj = new MonteCarlo(5, 3, 2);
        double x;
        double y;
        int cirCount = 0;
        int sqrCount = 0;
        for (int i = 0; i < 100; i++){
            x = mcObj.nextRainDrop_x();
            y = mcObj.nextRainDrop_y();
            if (mcObj.insideCircle(x, y)){
                cirCount += 1;
                
            }
            sqrCount += 1;
        }
        System.out.println((cirCount * (Math.pow(2 * mcObj.r, 2))/ (sqrCount * Math.pow(mcObj.r, 2))));
    }

}
