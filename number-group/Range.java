
public class Range
{
    private int min;
    private int max;
    private int random;
    
    public Range(int minValue, int maxValue)
    {
        this.min = minValue;
        this.max = maxValue;
    }
    
    public boolean contains(int value){
        boolean contains = false;
        if (value >= min && value <= max){
            contains = true;
        }
        return contains;
    }
}
