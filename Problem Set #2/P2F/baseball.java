public class baseball
{
    public static void main(String[] args)
    {
        double[] battingAverage = new double[9];
        double random;
        double max = 0;
        for (int i = 0; i < battingAverage.length; i++){
            random = Math.random()/2;
            battingAverage[i] = random;
            // System.out.println(battingAverage[i]);
        }
        
        for (int i = 0; i < battingAverage.length; i++){
            System.out.print(battingAverage[i] + "  ");
        }
        
        System.out.println("\n");
        
        for (int i = 0; i < battingAverage.length; i++){
            battingAverage[i] += 0.02;
        }
        
        for (int i = 0; i < battingAverage.length; i++){
            System.out.print(battingAverage[i] + "  ");
        }
         
        System.out.println("\n");
        
        for (int i = battingAverage.length - 1 ; i >= 0; i--){
            System.out.print(battingAverage[i] + "  ");
        }
         
        System.out.println("\n");
        
        for (int i = 0; i < battingAverage.length - 1; i++){
            if (max < battingAverage[i]){
                max = battingAverage[i];
            }
  
        }
        System.out.println(max);
    }
}
