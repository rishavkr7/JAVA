package LOOP;
import java.util.*;
public class TablePattern{
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int terms=scn.nextInt();
        for(int i=1 ; i<=terms ; i++){
           System.out.print("Enter a number: ");
           int num=scn.nextInt();
           for(int j=1 ; j<=10 ; j++){
            int product=j*num;
            System.out.println(num+" X "+j+" = "+product);
           }
        }
        scn.close();
    }
}

