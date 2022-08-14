package com.company;
import java.awt.geom.Area;
import java.util.Scanner;
public class CWH_expt_5 {
    public static void main(String[] args) {
        int length;
        int breath;
        int Area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        length = sc.nextInt();
        System.out.println("Enter breadth:");
        breath = sc.nextInt();

        Area = length * breath;
        System.out.println("Area of the Rectangle: "+Area);

    }
}

