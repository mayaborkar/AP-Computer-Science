import java.util.Scanner;
public class destroyer
{
    public static void main(String[] args){
        int bombX;
        int bombY;
        
        int usedCharges = 0;
        int indirectHit = 0;
    
        boolean validBomb;
        boolean exitGame = false;
        
        sub mySub1 = new sub();
        mySub1.showSubLocation();
        
        do{
            do{
                validBomb = true;
                if (validBomb){
                    bombX = Integer.valueOf(sub.getInput("Enter the x position of the depth charge: "));  
                }
                else{
                    validBomb = true;
                    bombX = Integer.valueOf(sub.getInput("Re-enter the x position of the depth charge: "));
                }
                if (bombX > 300 || bombX < 0){
                    System.out.println("\tError! The submarine is within this 300x300 meter area!");
                    validBomb = false;
                }
            }while(!validBomb);
            
            
            do{
                validBomb = true;
                if (validBomb){
                    bombY = Integer.valueOf(sub.getInput("Enter the y position of the depth charge: "));  
                }
                else{
                    validBomb = true;
                    bombY = Integer.valueOf(sub.getInput("Re-enter the y position of the depth charge: "));
                }
                if (bombY > 300 || bombY < 0){
                    System.out.println("\tError! The submarine is within this 300x300 meter area!");
                    validBomb = false;
                }
            }while(!validBomb);
            
            if (mySub1.directHit(bombX, bombY)){
                exitGame = true; 
                System.out.println("** Direct Hit! **\nThe submarine has been destroyed!");
            }
            else if(mySub1.indirectHit(bombX, bombY)){
                indirectHit += 1;
                usedCharges += 1;
                System.out.println("** Indirect Hit! **");
                if (indirectHit == 2){
                    exitGame = true;
                    System.out.println("** Two Indirect Hits! **\nThe submarine has been destroyed!");
                }
                else if(usedCharges == 5){
                    System.out.println("** Charge did not affect the submarine! **");
                }
            }
            else{
                usedCharges += 1;
                System.out.println("** Charge did not affect the submarine! **");
                if(usedCharges == 5){
                    System.out.println("** Charge did not affect the submarine! **");
                }
            }
        } while (!exitGame && usedCharges < 5);
    }
}
