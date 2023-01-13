package BASICS;
import java.util.*;
public class one{
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scn.nextInt();
        int reverse=0 , remender;
        while(num!=0)
        {
           remender=num%10;
           reverse=reverse*10+rem;
           num=num/10;
        }
        System.out.print("Reverse of given number is: "+reverse);
    scn.close();
    }
}
