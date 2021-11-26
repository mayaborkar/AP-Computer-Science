public class YourCarDriver
{
    public YourCarDriver()
    {
        car car1 = new car();
        car car2 = new car("Yellow", 100, true);
        System.out.print(car1.toString());
        System.out.println(car2.toString());
    }
}
