package com.company;

import java.util.Scanner;

public class CWS_81{
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks [0] = 23;
        marks [1] = 13;
        marks [2] = 9;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Index: ");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide with: ");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is: "+marks[ind]);
            System.out.println("The value of array-value/number is: "+marks[ind]/number);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured! ");
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured! ");
        }
        catch (Exception e) {
            System.out.println("Some other exception occured! ");
        }
    }
}
