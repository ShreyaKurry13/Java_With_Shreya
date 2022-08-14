package com.company;
import java.util.Scanner;


public class percentage {
    public static void main(String[] args) {
        float maths , chem , bio , phy , eng , sum , percentage;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter maths marks:");
        maths = sc.nextFloat();

        System.out.println("Enter chemistry marks:");
        chem = sc.nextFloat();

        System.out.println("Enter biology marks:");
        bio = sc.nextFloat();

        System.out.println("Enter physics marks:");
        phy = sc.nextFloat();

        System.out.println("Enter english marks:");
        eng = sc.nextFloat();

        sum = maths+phy+chem+eng+bio;
        System.out.println("The total marks are:"+sum);

        percentage = (sum/500)*100;
        System.out.println("The percentage is:"+percentage);
    }
}
