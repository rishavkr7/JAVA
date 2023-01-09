package GETTING_START;
import java.util.*;
public class EvenOdd {
 
public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.print("ENTER TERMS: ");
    int terms=scn.nextInt();
    for(int m=1;m<=terms;m++){
    System.out.print("Enter Number: ");
    int num = scn.nextInt();
    int rem = num%2;
    if(rem==0){
        System.out.println("Even Number");
    }
    else{
        System.out.println("Odd Number");
    }
   }
   scn.close();
  }  
}
