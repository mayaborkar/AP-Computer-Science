public class Jukebox
{
    private MySong songList[][];
    
    public Jukebox()
    {

        songList = new MySong[3][4];
        songList[0][0] = new MySong("Jet Airliner", 5); 
        songList[0][1] = new MySong( "Slide", 4 ); 
        songList[0][2] = new MySong( "Tom Sawyer", 3 ); 
        songList[0][3] = new MySong( "Purple Rain", 2 ); 
        songList[1][0] = new MySong( "Sing a Song", 1 ); 
        songList[1][1] = new MySong( "Baba O'Riley", 5 ); 
        songList[1][2] = new MySong( "Jumper", 4 ); 
        songList[1][3] = new MySong( "Car Wash", 3 ); 
        songList[2][0] = new MySong( "Kung Fu Fighting", 2 ); 
        songList[2][1] = new MySong( "Right as Rain", 4 ); 
        songList[2][2] = new MySong( "Beat It", 5 ); 
        songList[2][3] = new MySong( "Bust a Move", 4 );

    }
    
    public String toString(){
        String str = "";
        for(MySong[] mySongList : songList){
            for(MySong song : mySongList){
                str += "The name of your song is: " + song.getName() + ", and the rating is " + song.getRating() + "\n";
            }
        }
        return str;
    }
    
    public MySong randomSong(){
        int rowRandom = (int)(Math.random() * 3);
        int colRandom = (int)(Math.random() * 4);
        return songList[rowRandom][colRandom];
    }
    
    public String playSongofRating( int rating ){
        String str = "";
        for(MySong[] mySongList : songList){
            for(MySong song : mySongList){
                if(song.getRating() == rating){
                    str += "The name of your song is: " + song.getName();
                }
            }
        }
        return str;
    }
}