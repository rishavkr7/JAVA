package GETTING_START;
import java.util.*;
public class CompareThreeNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1=scn.nextInt();
        System.out.print("Enter Second Number: ");
        int num2=scn.nextInt();
        System.out.print("Enter Third Number: ");
        int num3=scn.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+" is greater than "+num2+" and "+num3);
            }
            else{
                System.out.println(num3+ " is grater than "+num1+" and "+num2);            
            }
        }
        else
        {
            if(num2>num3){
                System.out.println(num2+ " is greater than"+num1+" and "+num3); 
            }
            else{
                System.out.println(num3+ " is grater than "+num1+" and "+num2); 
            }
        }
        scn.close();
    }
}
