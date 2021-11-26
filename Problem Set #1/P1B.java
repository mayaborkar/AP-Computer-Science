public class quadratic
{
    public quadratic()
    {
        int a = 2;
        int b = 5;
        int c = 1;
        String message = "Sorry, your discriminant is negative. We cannot \nprocess imaginary root right now...";

        if ((4 * a * c) > b * b || a == 0){
            System.out.println(message);
        }
        else{
            System.out.println((-b + Math.sqrt((b * b) - (4 * a * c)))/ (2 * a));
            System.out.println((-b - Math.sqrt((b * b) - (4 * a * c)))/ (2 * a));
        }
    }
}
