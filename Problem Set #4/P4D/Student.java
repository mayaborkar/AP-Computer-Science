public class Student
{
    // instance variables - replace the example below with your own
    private String firstName;
    public String lastName;
    
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
        double sum = 0;
        for (int i = 0; i < grades.length; i ++){
            sum += grades[i];
        }
        average = sum/grades.length;
        
        return average;
    }
    
    public String getGrade(){
        if (calcGPA() >= 4.00){
            return "A";
        }
        else if (calcGPA() >= 3.00){
            return "B";
        }
        else if (calcGPA() >= 2.00){
            return "C";
        }
        else if (calcGPA() >= 1.00){
            return "D";
        }
        else{
            return "F";
        }
        
    }
    
    public String toString()
    {
        String str = "";
        
        str += "Student's First Name is: " + firstName + "\n";
        str += "Student's Last Name is: " + lastName + "\n";
        str += "Student's Average GPA is: " + calcGPA() + "\n";
        str += firstName + "'s Grade is: " + getGrade() + "\n";
        str += grades[0] + " " + grades[1] + " " + grades[2] + " " + grades[3] + " " + grades[4] + "\n";
        
        return str;
    }
}
