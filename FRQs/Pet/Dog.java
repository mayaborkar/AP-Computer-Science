
public class Dog extends Pet
{
    private String sound = "bark";
    public Dog(String name)
    {
        super(name);
    }

    public String speak()
    {
        return sound;
    }
    
    public String LoudDOg(){
        return (sound + " " + sound);
    }
}
