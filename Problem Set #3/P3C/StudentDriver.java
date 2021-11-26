public class StudentDriver
{
    public StudentDriver()
    {
        Student senior = new Student("Joe", "Senior", 3.0, 3.0, 3.5, 4.0, 4.0);
        System.out.println(senior.toString());
        senior.setMath(4.0);
        System.out.println(senior.getMath());
        System.out.println(senior.calcGPA());
        System.out.println(senior.toString());
    }

}
