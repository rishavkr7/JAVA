package GETTING_START;
import java.util.*;
public class CompareTwoNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter Two Number: ");
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        if(num1==num2){
            System.out.println("Both Numbers are Equal !!");
        }
        if(num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }
        if(num1<num2){
            System.out.println(num2+" is greater than "+num1);
        }
        scn.close();
    }
}
