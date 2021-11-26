public class StudentDriver
{
    public StudentDriver()
    {
        Student senior001 = new Student();
        Student frosh001 = new Student("Maya", "B", 10, true);
        System.out.println(senior001.toString());
        System.out.println(frosh001.toString());
    }
}
