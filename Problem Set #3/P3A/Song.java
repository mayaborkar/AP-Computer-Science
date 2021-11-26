public class Song
{
    // instance variables - replace the example below with your own
    String songTitle = "";
    String songArtist = "";
    double songCost = 0;
    // String songHowLong = "";
    String yourVar = "";
    boolean isNull;
    private int lengthInSecs;
    int seconds;
    int minutes;
    
    
    public Song(String title, String artist, double cost, String var, int time)
    {
        // initialise instance variables
        
        this.songTitle = title;
        this.songArtist = artist;
        this.songCost = cost;
        // songHowLong = time;
        this.yourVar = var;
        this.lengthInSecs = time;
       
    }
    
    public int getLengthInSec(){
        return lengthInSecs;
    }
    
    public void setLengthInSec(int newSeconds ){
        lengthInSecs = newSeconds;
    }
    
    public String convertToMinSec(){
        seconds = lengthInSecs % 60;
        
        return "The length of the song is: " + minutes + " minutes and " + seconds + " seconds";
    }
    
    public void setMinutes(int newMinutes){
        minutes = newMinutes;
    }
    
    public int getMinutes(){
        return minutes;
    }
    
    public void setSeconds(int newSeconds){
        seconds = newSeconds;
    }
    
    public int getSeconds(){
        return seconds;
    }

    public String toString()
    {
        String str = "";
        
        str += "Song title: " + songTitle + "\n";
        str += "Artist: " + songArtist + "\n";
        str += "Cost: $" + songCost + "\n";
        str += "Your created variable is: " + yourVar + "\n";
        str += convertToMinSec();
        
        return str;
    }
    
}

