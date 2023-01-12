package BASICS;
import java.util.*;
public class Fibbonnacci{
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        // System.out.println("0,1");
        int first=0;
        int second=1;
        int i=1;
        while(i<=num){
            int third=first+second;
            System.out.println(third);
            first=second;
            second=third;
            i++;
            }
        scn.close();  
    }
}