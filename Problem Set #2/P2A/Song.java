public class Song
{
    // instance variables - replace the example below with your own
    String songTitle = "";
    String songArtist = "";
    double songCost = 0;
    String songHowLong = "";
    String yourVar = "";
    boolean isNull;
    
    /**
     * Constructor for objects of class Song
     */
    public Song(){
        String songTitle = "";
        String songArtist = "";
        double songCost = 0;
        String songHowLong = "";
        String yourVar = "";
    }
    public Song( String title, String artist, double cost, String time, String var)
    {
        // initialise instance variables
        
        songTitle = title;
        songArtist = artist;
        songCost = cost;
        songHowLong = time;
        yourVar = var;
       
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        /*
        the tostring is a special method that returns a string t
        that contains the values of all the instance vars of the
        object in an easily read format. meaning they are labeled.
        its special because it is run by system.outing the object
        system.out.println(obj) like that
        so this returns a string
        and you need to construct the string in the body
        and so on for all the instance vas
        */
        String str = "";
        
        str = str + "Song title: " + songTitle + "\n";
        str = str + "Artist: " + songArtist + "\n";
        str = str + "Cost: $" + songCost + "\n";
        str = str + "The duration of your song is: " + songHowLong +"\n";
        str = str + "Your created variable is: " + yourVar + "\n";
        
        return str;
    }
    
}
