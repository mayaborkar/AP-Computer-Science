import java.lang.Math.*;
public class DistToLine
{
    public static double A;
    public static double B;
    public static double C;
    
    
    public static double getDist(double a, double b){
        return Math.abs(A * a + B * b + C) / Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
    }
}
