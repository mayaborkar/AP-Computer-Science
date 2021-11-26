import java.util.*;
public class sub
{
    int subLength ; // (int) (Math.random() * 31) + 40;
    int subHeight; // (int) (Math.random() * 11) + 10;
    int topLeftX;
    int topLeftY;
    int topRightX;
    int topRightY;
    int bottomLeftX;
    int bottomLeftY;
    int bottomRightX;
    int bottomRightY;
    int middleX;
    int middleY;
    // generic method to get input and create scanner object
    public static int getInput(String prompt){
        System.out.print(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    public void randomizeLength(){
        this.subLength = (int) (Math.random() * 31) + 40;
    }
    
    public void randomizeHeight(){
        this.subHeight = (int) (Math.random() * 11) + 10;
    }
    // generate random subX so 0 < 300 - subLength < 300
    // generate random subY so 0 < 300 - subHeight < 300
    // Math.random() * (max - min + 1) + min
    public void subXY(){
        this.topLeftX = (int) (Math.random() * (300 - this.subLength + 1));
        this.topLeftY = (int) (Math.random() * (300 - this.subHeight + 1));
        this.topRightX = this.topLeftX + this.subLength;
        this.topRightY = this.topLeftY;
        this.bottomLeftX = this.topLeftX;
        this.bottomLeftY = this.topLeftY + this.subHeight;
        this.bottomRightX = this.topLeftX + this.subHeight + this.subLength;
        this.bottomRightY = this.topLeftY + this.subHeight + this.subLength;
        this.middleX = this.topLeftX + (this.subLength / 2);
        this.middleY = this.topLeftY + (this.subHeight / 2);
    }

    public void showSubLocation(){
        System.out.print("subX = " + this.topLeftX);
        System.out.print(" subY = " + this.topLeftY);
        System.out.print(" subLength = " + this.subLength);
        System.out.println(" subXHeight = " + this.subHeight);
    }
    
    public double distance(int x1, int y1, int x2, int y2){
        double d = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return d;
    }
    
    public boolean directHit(int bombX, int bombY){
        boolean isDirectHit = false;
        double topLeftToBomb = distance(this.topLeftX, this.topLeftY, bombX, bombY);
        double topRightToBomb = distance(this.topRightX, this.topRightY, bombX, bombY);
        double bottomLeftToBomb = distance(this.bottomLeftX, this.bottomLeftY, bombX, bombY);
        double bottomRightToBomb = distance(this.bottomRightX, this.bottomRightY, bombX, bombY);
        double middleToBomb = distance(this.middleX, this.middleY, bombX, bombY);
        if (topLeftToBomb <= 30.0 || topRightToBomb <= 30.0 || bottomLeftToBomb <= 30.0 || bottomRightToBomb <= 30.0 || middleToBomb <= 30.0){
            isDirectHit = true;
        }
        return isDirectHit;
    }
    
    public boolean indirectHit(int bombX, int bombY){
        boolean isIndirectHit = false;
        double topLeftToBomb = distance(this.topLeftX, this.topLeftY, bombX, bombY);
        double topRightToBomb = distance(this.topRightX, this.topRightY, bombX, bombY);
        double bottomLeftToBomb = distance(this.bottomLeftX, this.bottomLeftY, bombX, bombY);
        double bottomRightToBomb = distance(this.bottomRightX, this.bottomRightY, bombX, bombY);
        double middleToBomb = distance(this.middleX, this.middleY, bombX, bombY);
        if (topLeftToBomb <= 50.0 || topRightToBomb <= 50.0 || bottomLeftToBomb <= 50.0 || bottomRightToBomb <= 50.0 || middleToBomb <= 50.0){
            isIndirectHit = true;
        }
        return isIndirectHit;
    }
    
    // Constructor
    public sub(){
        this.randomizeLength();
        this.randomizeHeight();
        this.subXY();
    }
}   
