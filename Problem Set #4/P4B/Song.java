import java.util.*;
import java.io.*;

public class Song{
    String title;
    String artist;
    double cost;
    boolean ifReal;
    private int lengthInSecs;
    
    public Song (String t, String a, double c, boolean ifFake, int sec){
        title = t;
        artist = a;
        cost = c;
        ifReal = ifFake;
        lengthInSecs = sec;
    }
    public String toString(){
        String album = "The title of your song is " + title + "\n" + 
        "The artist is " + artist + "\n" + 
        "It costs " + cost + "\n" +
        "The length of the song in seconds is " + lengthInSecs;
        if (ifReal){
            album += "\n" + "You have a real copy";
        }else{
            album += "\n" + "Why do you pirate songs?";
        }
        album += "\n" + convertToMinSec();
        return album;
    }
    public int getLengthInSec(){
        return lengthInSecs;
    }
    public void setLengthInSec(int newSeconds){
        lengthInSecs = newSeconds;
    }
    public String convertToMinSec(){
        String output;
        int min = (int)(lengthInSecs / 60);
        int sec = lengthInSecs % 60;
        
        output = "The length of the song is: " + min + " minutes and " + sec + " seconds.";
        return output;
    }
    public String getMinutes(){
        String mins;
        mins = "The length of the song in minutes is " + (int)(lengthInSecs / 60);
        return mins;
    }
    public String getSeconds(){
        String secs;
        secs = "The length of the song in seconds is " + lengthInSecs;
        return secs;
    }
}