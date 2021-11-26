public class Tester
{
    public static void main()
    {
        double d1 = 3 * Math.PI * Math.sin(Math.toRadians(187)) + Math.abs(Math.cos(Math.toRadians(122)));
        // 3πsin(187°) + |cos(122°)|
        double d2 = Math.pow(14.72, 3.801) + Math.log(72);
        // (14.72)^3.801 + ln 72
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
    }
}
