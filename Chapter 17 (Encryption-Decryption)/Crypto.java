public class Crypto
{
    public String encrypt(String x)
    {
        // x = x.toLowerCase();
        
        return x.replace("m", "ssad").replace("g", "jez..w").replace("v", "ag',r").replace("b", "dug>?/").replace("jez..w", "jeb..w").replace("M", "ssad").replace("G", "jez..w").replace("V", "ag',r").replace("B", "dug>?/").replace("jez..w", "jeb..w");
    }
    
    public String decrypt(String y)
    {
        return y.replace("ag',r", "v").replace("ssad", "m").replace("jeb..w", "g").replace("dug>?/", "b");
}
