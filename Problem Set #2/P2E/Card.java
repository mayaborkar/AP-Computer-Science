public class Card
{
    // instance variables - replace the example below with your own
    // J = 10, Q = 10, K = 10; A = 1 or 11;
   int cardNumber;
   String cardName;
   String cardSuit;

   public Card()
   {
        // initialise instance variables
        cardNumber = 0;
        cardName = "";
        cardSuit = "";
   }
    
   public Card(int num, String name, String suit)
   {
        // initialise instance variables
        cardNumber = num;
        cardName = name;
        cardSuit = suit;
   }
    
   public String toString()
    {
        String str = "";
        str += "The number of your card is: " + cardNumber + " \n";
        str += "The name of your card is: " + cardName + " \n";
        str += "The suit of your card is: " + cardSuit + " \n";
        return str;
    }
}
