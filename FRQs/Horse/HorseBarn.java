/**
 * Write a description of class HorseBarn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HorseBarn
{
    private Horse[] spaces;
    
    public HorseBarn()
    {
       
    }

    public int findHorseSpace(String name){
        int index = 0;
        for(int i = 0; i < spaces.length; i++){
            if(spaces[i].equals(name)){
                index = i;
            }
        }
        return index;
    }
    
    public void consolidate(){
        Horse[] newSpaces = new Horse[spaces.length];
        int index = 0;
        for(int i = 0; i < spaces.length; i++){
            if (spaces[i] != null){
                newSpaces[index] = spaces[i];
                index++;
                
            }
            spaces = newSpaces;
        }
    }
}