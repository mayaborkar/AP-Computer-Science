public class CardDriver
{
    public CardDriver()
    {
        Card card1 = new Card();
        Card card2 = new Card(5, "5", "Spades");
        Card card3 = new Card(10, "Jack", "Hearts");
        
        Card[] myHand = new Card[3];
        myHand[0] = card1;
        myHand[1] = card2;
        myHand[2] = card3;
        
        for (int i = 0; i < myHand.length; i++){
            System.out.println(myHand[i]);
        }
        
        
        
    }
}
