package com.company;

import java.util.Scanner;

public class CWS_82_nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 23;
        marks[1] = 13;
        marks[2] = 9;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the Array Index: ");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video no 82");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist!!");
                    System.out.println("Exception in level 2");
                }
            }
            catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program!!");
    }
}
