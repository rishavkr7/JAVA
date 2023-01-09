package GETTING_START;

import java.util.Scanner;

public class InputNumber {
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter any Integer: ");
        int n = scn.nextInt();
        System.out.print("Input Integer is: "+n);
        scn.close();
    }
}
