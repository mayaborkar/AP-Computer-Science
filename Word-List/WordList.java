import java.util.*;
public class WordList
{
    private ArrayList<String> myList;
    
    public WordList()
    {
        myList = new ArrayList<String>();
        myList.add("cat");
        myList.add("mouse");
        myList.add("frog");
        myList.add("dog");
        myList.add("dog");
    }
    
    public int numWordsOfLength(int len){
        int count = 0;
        for (int i = 0; i < myList.size(); i++){
            if(myList.get(i).length() == len){
                count += 1;
            }
        }
        return count;
    }
    
    public void removeWordsOfLength(int len){
        for(int i = 0; i < myList.size(); i++){
            if(myList.get(i).length() == len){
                myList.remove(myList.get(i));
            }
        }
    }
}