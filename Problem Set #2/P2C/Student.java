
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    String firstName;
    String lastName;
    int grade;
    boolean isTakingAPCompSci;

    public Student()
    {
        // initialise instance variables
        firstName = "";
        lastName = "";
        grade = 0;
        isTakingAPCompSci = false;
    }
    
    public Student(String yourFirst, String yourLast, int yourGrade, boolean isAPCompSci){
        firstName = yourFirst;
        lastName = yourLast;
        grade = yourGrade;
        isTakingAPCompSci = isAPCompSci;
    }
    
    public String toString()
    {
        String str = "";
        str = str + "Your first name is: " + firstName +"\n";
        str = str + "Your last name is: " + lastName +"\n";
        str = str + "Your grade is: " + grade +"\n";
        str = str + "You are taking AP Comp Sci: " + isTakingAPCompSci +"\n";
        return str;
    }
}
