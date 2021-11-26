public class SongDriver
{
    public SongDriver()
    {
        // Song wakeUpSong = new Song();
        Song goToSleepSong = new Song("Sweet Caroline", "Neil Diamond", 2, "hello", 1);
        // System.out.println(wakeUpSong.toString());
        
        System.out.println(goToSleepSong.getLengthInSec());
        goToSleepSong.setLengthInSec(90);
        System.out.println(goToSleepSong.getLengthInSec());
        
        System.out.println(goToSleepSong.getMinutes());
        System.out.println(goToSleepSong.getSeconds());
        
        System.out.println(goToSleepSong.toString());
    }
}
