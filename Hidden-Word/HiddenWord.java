public class HiddenWord
{
    private String hiddenWord;
    public HiddenWord(String word)
    {
        hiddenWord = word;
    }
    
    public String getHint(String yourWord){
        char currentLetter;
        char letter;
        for(int i = 0; i < hiddenWord.length(); i++){
            letter = yourWord.charAt(i);
            for(int j = 0; j < hiddenWord.length(); j++){
                currentLetter = yourWord.charAt(j);
              if(yourWord.substring(i, i+1).equals(hiddenWord.charAt(j))){
                  if(i == j){
                      
                  }
                  else{
                      currentLetter = '+';
                  }
              }
              else{
                  letter = '*';
              }
            }
        }
        return yourWord;
    }
}
