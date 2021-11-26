import java.util.*;
public class MyPhoneDriver
{
    public MyPhoneDriver()
    {
        Song song1 = new Song("hello", "adele", 2.5, false,  60);
        Song song2 = new Song("Sweet Caroline", "Neil Diamond", 5, true,  300);
        Song song3 = new Song("---", "artist", 6.549, false,  14);
        Song song4 = new Song("flgvlfr", "someone", 2, true,  40);
        ArrayList<Song> mySongs = new ArrayList<Song>();
        mySongs.add(0, song1);
        mySongs.add(1, song2);
        mySongs.add(2, song3);
        mySongs.add(3, song4);
        
        MyPhone phone = new MyPhone("Yellow", 3, mySongs);
        System.out.println(phone.toString());
        
        System.out.println(phone.totalPlayTime());
        phone.deleteAllSongs();
        System.out.println(phone.toString());
    }
}
