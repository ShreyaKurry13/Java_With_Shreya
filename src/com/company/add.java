package com.company;
import java.util.Scanner;
public class add{

public static void main(String[]args){
        int x , y, sum , subtract , multiplication ;
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the value of x:");
        x = sc.nextInt();


        System.out.println("Enter the value of y:");
        y = sc.nextInt();

    //    sum = x+y;
      //    subtract = x-y;
        multiplication = x*y;
      //  System.out.println("Sum is: " +sum);
      //  System.out.println("subtraction is:"+subtract);
        System.out.println("Multiplication is:" +multiplication);
        }
}