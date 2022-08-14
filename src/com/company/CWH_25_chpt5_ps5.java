package com.company;

import javax.print.attribute.standard.OrientationRequested;
import java.util.Scanner;

public class CWH_25_chpt5_ps5 {
    public static void main(String[] args) {
        // Question 1
    //    int n = 4;
     //   for (int i=n;i>0;i--) {
     //       for (int j = 0; j < i; j++) {
     //           System.out.print("*");

     //       }
     //       System.out.print("\n");
      //  }

        // Question 2
    //    int sum = 0;
    //    int n = 3;
    //    for (int i=0;i<n;i++){
    //        sum = sum + (2*i);
    //    }
    //    System.out.println("Sum of even numbers is: "+sum);

        //Question 3
     //   Scanner sc = new Scanner(System.in);
     //   System.out.print("Enter the table:");
     //   int table = sc.nextInt();

     //   for (int i=1;i<=10;i++){
    //    System.out.printf("%d X %d = %d\n",table,i,table*i);
        //    }

        // Question 4
    //    int n=10;
    //    for (int i=10;i>=1;i--){
    //    System.out.printf("%d X %d = %d\n",n,i,n*i);
      //  }
        // OR
    /*    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table:");
        int table = sc.nextInt();

        for (int i=10;i>=1;i--){
        System.out.printf("%d X %d = %d\n",table,i,table*i);
        }*/


     /*   //Question 5
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i=1;i<=n; i++){
            factorial *= i;
        }
        System.out.println(factorial);

        // Question 6
     /*   Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int i=1;
        int factorial = 1;
        while (i<=n){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);

      */

       //Question 7
    /*    int n = 4;
        int i=n;
        while (i>0)
        {
        int j = 0;
        while (j<i)
        {
        System.out.print("*");
        i--;
        }
        System.out.print("\n");
        j++;
        }  */

        // Problem 9
     /*   Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int sum = 0;

        for (int i=1;i<=10;i++){
            sum += n*i;
        }
        System.out.println(sum);

      */

        //Problem 11
        int sum = 0;
        int n = 5;
        int i=0;
        while (i<n){
        sum = sum + (2*i);
        i++;
        }
        System.out.println("Sum of even numbers is: "+sum);
    }
}
