public class P1H
{
    public static void main()
    {
        String[] artists = new String[4];
        artists[0] = "Billy Joel";
        artists[1] = "Michael Jackson";
        artists[2] = null;
        artists[3] = "Mozart";
        for (int i = 0; i < artists.length; i++){
            // .equals checks if the values in a memory location are equal
            // errors because the actually memory spaces are not in the same place
            if (artists[i].equals("Michael Jackson")){
                System.out.println("We found Micheal!");
            }
            else{
                System.out.println("Michael NOT found...");
            }
        }
    }
}
