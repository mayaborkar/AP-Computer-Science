public class LinearFunction implements LinearFunctionMethods
{
    double slope;
    double yIntercept;
    
    public LinearFunction(double slope, double yIntercept)
    {
       this.slope = slope;
       this.yIntercept = yIntercept;
    }

    public double getSlope(){
        return this.slope;
    }
    
    public double getYintercept( ){
        return this.yIntercept;
    }
    
    public double getRoot(){
        return (- this.yIntercept)/(this.slope);
    }
    
    public double getYvalue(double x){
        return this.slope*x + this.yIntercept;
    }
    
    public double getXvalue(double y){
        return (y - this.yIntercept) / this.slope;
    }
}
