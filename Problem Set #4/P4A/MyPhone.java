
/**
 * Write a description of class MyPhone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyPhone
{
    // instance variables - replace the example below with your own
    String color;
    double memoryCapacity;
    Song[] songLibrary = new Song[4];

    /**
     * Constructor for objects of class MyPhone
     */
    public MyPhone(String phoneColor, double phoneMemory, Song[] yourSongs)
    {
        this.color = phoneColor;
        this.memoryCapacity = phoneMemory;
        this.songLibrary = yourSongs;
    }

    public int totalPlayTime()
    {
        int totalSeconds = 0;
        for (int i = 0; i < songLibrary.length; i++){
            totalSeconds += songLibrary[i].getLengthInSec();
        }
        
        return totalSeconds;
    }    
    
    public void deleteAllSongs()
    {
        for (int i = 0; i < songLibrary.length; i ++){
            songLibrary[i] = null;
        }
    }
    
    public String toString(){
        String str = "";
        str += "The color of your phone is: " + this.color + "\n";
        str += "The memory capacity of your phone is: " + this.memoryCapacity + " GB \n";
        for (int i = 0; i < songLibrary.length; i++){
            str += "\n " + songLibrary[i];
        }
        
        return str;
    }
}
