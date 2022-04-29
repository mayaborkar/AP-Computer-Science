import java.util.*;
public class WordPairList
{
    private ArrayList<WordPair> allPairs;
    
    public static void main(){
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList exampleThree = new WordPairList(moreWords);
        System.out.println(exampleThree.numMatches());
    }
    
    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<WordPair>();
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    public int numMatches(){
        int matches = 0;
        for(WordPair word : allPairs){
            if(word.getFirst().equals(word.getSecond())){
                matches++;
            }
        }
        return matches;
    }
}