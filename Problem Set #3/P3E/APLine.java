public class APLine
{
    // instance variables - replace the example below with your own
    double a;
    double b;
    double c;
    double slope;
    boolean isLine = false;
    String str = "";
    
    public APLine(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSlope()
    {
        this.slope = (-(this.a)/(this.b));
        
        return this.slope;
    }
    
    public boolean isOnLine(int x, int y)
    {
        if ((this.a * x + this.b * y + this.c) == 0){
            this.isLine = true;
        }
        
        return this.isLine;
    }
    
   
}
