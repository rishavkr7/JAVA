package BASICS;
import java.util.*;
public class one{
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scn.nextInt();
        int reverse=0 , rem;
        while(num!=0)
        {
           rem=num%10;
           reverse=reverse*10+rem;
           num=num/10;
        }
        System.out.print(reverse);
    scn.close();
    }
}
