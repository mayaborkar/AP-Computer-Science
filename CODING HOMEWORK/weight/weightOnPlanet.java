import java.util.*;
public class weightOnPlanet
{
    public weightOnPlanet()
    {
        Scanner weight = new Scanner(System.in);
        Scanner planet = new Scanner(System.in);
        
        double planetWeight;
        double yourWeight;
        int yourSelection;
        
        System.out.print("What is your weight on the Earth? ");
        yourWeight = weight.nextDouble();
        System.out.print("1. Voltar\n2. Krypton\n3. Fertos\n4. Servontos");
        System.out.print("\n\tSelection? ");
        yourSelection = planet.nextInt();
        

        switch(yourSelection){
            case 1:
                planetWeight = yourWeight * 0.091;
                System.out.print("Your weight on Voltar would be " + planetWeight);
                break;
            case 2:
                planetWeight = yourWeight * 0.720;
                System.out.print("Your weight on Voltar would be " + planetWeight);
                break;
            case 3:
                planetWeight = yourWeight * 0.865;
                System.out.print("Your weight on Fertos would be " + planetWeight);
                break;
            case 4:
                planetWeight = yourWeight * 4.612;
                System.out.print("Your weight on Servontos would be " + planetWeight);
                break;
            default:
                System.out.print("Please enter 1, 2, 3 ,or 4");
        }
    }
}