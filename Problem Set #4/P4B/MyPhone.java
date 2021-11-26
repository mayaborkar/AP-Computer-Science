import java.util.*;
public class MyPhone
{
    // instance variables - replace the example below with your own
    String color;
    double memoryCapacity;
    ArrayList<Song> songLibrary = new ArrayList<Song>();

    /**
     * Constructor for objects of class MyPhone
     */
    public MyPhone(String phoneColor, double phoneMemory, ArrayList<Song> yourSongs)
    {
        this.color = phoneColor;
        this.memoryCapacity = phoneMemory;
        this.songLibrary = yourSongs;
    }

    public int totalPlayTime()
    {
        int totalSeconds = 0;
        for (int i = 0; i < songLibrary.size(); i++){
            totalSeconds += songLibrary.get(i).getLengthInSec();
        }
        
        return totalSeconds;
    }    
    
    public void deleteAllSongs()
    {
        for (int i = 0; i < songLibrary.size(); i ++){
            songLibrary.remove(songLibrary.get(i));
        }
    }
    
    public String toString(){
        String str = "";
        str += "The color of your phone is: " + this.color + "\n";
        str += "The memory capacity of your phone is: " + this.memoryCapacity + " GB \n";
        for (int i = 0; i < songLibrary.size(); i++){
            str += "\n" + songLibrary.get(i);
        }
        
        return str;
    }
}
