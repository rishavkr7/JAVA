/*1. You are given as input marks of a student.
2. Display an appropriate message based on the following rules:
  	  2.1 
  	  2.2 for marks above 80 and less than equal to 90, print good.
  	  2.3 for marks above 70 and less than equal to 80, print fair.
  	  2.4 for marks above 60 and less than equal to 70, print meets expectations.
  	  2.5 for marks less than equal to 60, print below par.

Note -> Only change the code in area after - // code here

Constraints
No constraints

Format
Input
Input is handled for you and provided as variable marks

Output
Appropriate message as per student's marks

Example
Sample Input

92

Sample Output*
excellent*/

//CODE START FROM HERE: 


package GETTING_START;
import java.util.*;
public class GradingSystem {
  public static void main(String[] args){
  Scanner scn = new Scanner(System.in);
  int marks = scn.nextInt();
  if (marks>90){
    System.out.println("excellent");
  }
  else if (marks>80 && marks<=90 ){
    System.out.print("good");
  }
  else if(marks>70 && marks<=80){
    System.out.print("fair");
  }
  else if(marks>60 && marks<=70){
    System.out.print("meet exeception");
  }
  else{
    System.out.print("below par");
  }
  scn.close();
  }  
}
