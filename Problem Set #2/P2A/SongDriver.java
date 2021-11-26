public class SongDriver
{
    public SongDriver()
    {
        Song wakeUpSong = new Song();
        Song goToSleepSong = new Song("Sweet Caroline", "Neil Diamond", 2, "3 minutes", "hello");
        System.out.println(wakeUpSong.toString());
        System.out.println(goToSleepSong.toString());
    }
}
