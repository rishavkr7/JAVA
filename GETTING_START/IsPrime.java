package GETTING_START;
import java.util.*;
public class IsPrime {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scn.nextInt();
        int flag=0;
        for(int i=2;i<num/2;i++){
            if(i%num==0){
                flag++;
                break;
            }
        }
        if(flag==0){
            System.out.print("prime");
        }
        else{
            System.out.print("not-prime");
        }
    
        scn.close();
    }
}
