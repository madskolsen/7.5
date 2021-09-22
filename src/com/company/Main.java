package com.company;
import java.util.Scanner;
public class Main {


   public static boolean canFactor (int n, int [] factorArray){

       for (int i = 0; i < factorArray.length; i++) {
           if (factorArray[i] % n !=0) return false;
       }
       return true;
   }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to check against the array?: ");
        int n = scanner.nextInt();
        int [] factorArray = new int [30];
        int plusF = 1;
        for (int i = 0; i < factorArray.length; i++) {
            factorArray[i]=plusF;
            plusF++;
        }
        canFactor(n, factorArray);
        System.out.println(canFactor(n, factorArray));
    }
}
