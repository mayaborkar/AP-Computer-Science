public class MySong
{
    // instance variables - replace the example below with your own
    private String name;
    private int rating;

    public MySong()
    {
        this.name = "";
        this.rating = 0;
    }
    
    public MySong(String name, int rating)
    {
        this.name = name;
        this.rating = rating;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setRating(int rating){
        this.rating = rating;
    }
    
    public int getRating(){
        return this.rating;
    }
    
    public String toString()
    {
        String str = "";
        str += "The name of this song is: " + this.name + "\n";
        str += "The rating of this song is: " + this.rating + "\n";
        return str;
    }
}