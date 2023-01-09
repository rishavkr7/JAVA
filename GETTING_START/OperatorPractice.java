package GETTING_START;
import java.util.*;
public class OperatorPractice {
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in);
        
        System.out.println("ENTER A FOR ADD TWO NUMBER");
        System.out.println("ENTER S FOR SUBSTARCTION");
        System.out.println("ENTER M FOR MULTIPLY TWO NUMBER");
        System.out.println("ENTER R FOR FIND OUT REMAINDER");
        char cR = scn.next().charAt(0);
        System.out.print("Enter Number 1: ");
        int num1 = scn.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = scn.nextInt();

        switch(cR){
            case 'A':
            int addition=num1+num2;
            System.out.print("Addition of Given Two Number is : "+addition);
            break;

            // case '-':
            // int sub=
        }
        

        scn.close();
        
    }
}
