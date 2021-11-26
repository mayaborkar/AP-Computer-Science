import java.util.*;
public class MonteCarlo
{
    // instance variables - replace the example below with your own
    public double h;
    public double k;
    public double r;
    
    
    private Random rdmn = new Random();

    
    public MonteCarlo(int yourH, int yourK, int yourR)
    {
        this.h = yourH;
        this.k = yourK;
        this.r = yourR;
    }

    public double nextRainDrop_x()
    {
        double x;
        // r = nextDouble * (max - min) + min
        x = this.rdmn.nextDouble() * (2 * this.r) + (this.h - this.r);
        return x;
    }
    
    public double nextRainDrop_y()
    {
       double y;
       // r = nextDouble * (max - min) + min
       y = this.rdmn.nextDouble() * (2 * this.r) + (this.k - this.r);
       return y; 
    }
    
    public boolean insideCircle(double x, double y )
    {
        if (Math.pow((x- h), 2) + Math.pow((y - k),2) <= Math.pow(r, 2)){
            return true;
        }
        else{
            return false;
        }
    }
}
