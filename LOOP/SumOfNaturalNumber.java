package LOOP;
import java.util.*;
public class SumOfNaturalNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int num=scn.nextInt();
        int sum=0;
        sum=(num*(num+1))/2;
        System.out.println(sum);
        scn.close();
    }
}
