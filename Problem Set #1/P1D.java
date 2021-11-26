public class square
{
    public square()
    {
        for (int i = 1; i <= 10; i++){
            System.out.println(i + "\t" + (i * i) + "\t" + ((int)((i * i - i + 1)* Math.random() + i)));
        }
    }
}
