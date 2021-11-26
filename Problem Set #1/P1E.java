public class favoriteStrings
{
    public favoriteStrings()
    {
        String[] movies = new String[3];
        movies[0] = new String("Inception");
        movies[1] = new String("Star Wars: Episode 6");
        movies[2] = new String("Matrix");
        
        String[] songs = new String[3];
        songs[0] = new String("I'm a Believer");
        songs[1] = new String("Shilo");
        songs[2] = new String("On Top of the World");
        
        for (int i = 0; i < movies.length; i++){
            System.out.println(movies[i]);
        }
        
        System.out.print("\n\n");
        int i = 0;
        
        while (i < songs.length){
            if (i == 2){
                System.out.print(songs[i]);
            }
            else{
              System.out.print(songs[i] + ",");  
            }
            i++;
        }
    }
}
