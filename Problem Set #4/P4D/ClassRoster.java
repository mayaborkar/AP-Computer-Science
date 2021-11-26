import java.util.*;
public class ClassRoster
{
    // instance variables - replace the example below with your own
    private String courseName;
    ArrayList<Student> studentList = new ArrayList<Student>(5); 
   
    public ClassRoster(String className)
    {
        this.courseName = className;
    }

    public String studentWithMaxGPA(){
        double maxGPA = studentList.get(1).calcGPA();
        Student myStudent = studentList.get(1);
        for(int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).calcGPA() > maxGPA){
                myStudent = studentList.get(i);
            }
        }
        
        return myStudent.lastName;
    }
    
    public int dropStudent( int minGradeLevel){
        int dropCount = 0;
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).calcGPA() < minGradeLevel){
                studentList.remove(studentList.get(i));
                dropCount += 1;
            }
        }
        
        return dropCount;
    }
    
    public void addStudent( Student newStudent ){
        studentList.add(newStudent);
    }


    public String toString()
    {
        String str = "";
        str += "Your course name is: " + courseName;
        for (int i = 0; i < studentList.size(); i++){
            str += "Student " + i + " is " + studentList.get(i);
        }
        
        return str;
    }
}
