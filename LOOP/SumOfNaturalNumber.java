package LOOP;
import java.util.*;
public class SumOfNaturalNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter the TERMS: ");
        int terms=scn.nextInt();
        for(int i=1;i<=terms;i++){
        
        int num=scn.nextInt();
        int sum=0;
        sum=(num*(num+1))/2;
        System.out.println(sum);
    }
    }
}
