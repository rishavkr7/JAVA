package LOOP;
import java.util.*;
public class print {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of times: ");
        int input=scn.nextInt();
        for(int i=1;i<=input;i++){
            System.out.println(i+" Hello JAVA !!!");
        }
        scn.close();
    }
}
