import java.util.*;
public class calculator
{
    public calculator()
    {
        System.out.println("Make your arithmetic selection from the choices below:\n");
        System.out.println("    A. Add");
        System.out.println("    S. Subtract");
        System.out.println("    M. Multiply");
        System.out.println("    D. Divide\n");
        
        System.out.print("  Your choice? ");
        
        Scanner kbReader = new Scanner(System.in);
        String choice = kbReader.nextLine( );
        //char ch = choice; //You would think this would work...but it doesn’t. char ch = choice.charAt(0); //you just learned another String method.
        System.out.print("\nEnter first operand. "); 
        double op1 = kbReader.nextDouble( );
        System.out.print("\nEnter second operand. "); 
        double op2 = kbReader.nextDouble( );
        System.out.println(" ");
        switch (choice)
        {
            case "Add": //addition
            case "add": //Notice we are providing for both capital A and little a.
                System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2) );
                break;
            case "Subtract":
            case "subtract":
                System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2) );
                break;
            case "Multiply": 
            case "multiply":
                System.out.println(op1 + " times " + op2 + " = " + (op1 * op2) );
                break;
            case "Divide": 
            case "divide":
                System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2) );
                break; 
            default:
                System.out.println("Hey dummy, enter only a Add, Subtract, Multiply, or Divide!"); 
        }
    }
}
