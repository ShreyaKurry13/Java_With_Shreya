package com.company;
import java.util.Scanner;
public class java_call_by_reference {
//    public void stars(int x) {
//        for (int i = 1; i <= x; i++) {
//            for (int j = i; j <= x; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
     static void stars(int n){
         for (int i=1;i<=n;i++){// 2
             for (int j=i;j<=n;j++){ //2
                 System.out.print("  ");
             }
             for (int s=1;s<=i;s++){
                 System.out.print("* ");
             }
             System.out.println();
         }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // To print
        /*
         * * * *
         * * *
         * *
         *
         */
        System.out.println("Enter the stars: ");
        int n = sc.nextInt();
        java_call_by_reference java = new java_call_by_reference();
//        java.stars(n);
        //Write a function to print the nth term of the Fibonacci series using methods
//        padai krte hai parso abhi soo jaa
        stars(n);



    }
}