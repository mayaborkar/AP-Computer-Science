public class Student
{
    // instance variables - replace the example below with your own
    String firstName;
    String lastName;
    
    double[] grades = new double[5];
    double average;
   
    private double mathGPA;

    // English; Math; Science; Fine Arts; Social Studies
    // A = 4.00; A- = 3.7; B+ = 3.30; B = 3.00; B- = 2.70
    
    public Student()
    {
        // initialise instance variables
        firstName = "";
        lastName = "";
        grades[0] = 0;
        grades[1] = 0;
        grades[2] = 0;
        grades[3] = 0;
        grades[4] = 0;
        
    }
    
    public Student(String first, String last, double engGrade, double mathGrade, double sciGrade, double artsGrade, double socialGrade)
    {
        // initialise instance variables
        firstName = first;
        lastName = last;
        grades[0] = engGrade;
        grades[1] = mathGrade;
        grades[2] = sciGrade;
        grades[3] = artsGrade;
        grades[4] = socialGrade;
        
    }
    
    public double getMath(){
        return mathGPA;
    }
    
    public void setMath(double myMathGPA){
        mathGPA = myMathGPA;
    }
    
    
    public double calcGPA()
    {
        // put your code here
        for (int i = 0; i < grades.length; i ++){
            average += grades[i];
        }
        
        return average/grades.length;
    }
    
    public String toString()
    {
        String str = "";
        
        str += "Student: " + firstName + " " + lastName + "\n";
        str += "English: " + grades[0] + "\n";
        str += "Math: " + grades[1] + "\n";
        str += "Science: " + grades[2] + "\n";
        str += "Fine Arts: " + grades[3] + "\n";
        str += "Social Science: " + grades[4] + "\n";
        str += "Cumulative GPA: " + calcGPA() + "\n";
        
        return str;
    }
}
