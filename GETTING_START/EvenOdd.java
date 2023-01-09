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
    if(num%2==0){
        System.out.println("It is Even Number");
    }
    else{
        System.out.println("It is odd Number");
    }
   }
   scn.close();
  }  
}
