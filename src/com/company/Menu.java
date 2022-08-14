package com.company;

import java.util.*;
public class Menu{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your choice:\n 1.Lcm\n 2.Print Fibonacci Series\n 3.Reverse of a Number ");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                int n1,n2;
                int gcd,lcm,remainder,numerator,denominator;
                System.out.println("Enter two Numbers");
                n1=sc.nextInt();
                n2=sc.nextInt();
                if (n1>n2)
                {
                    numerator=n1;
                    denominator=n2;
                }
                else
                {
                    numerator=n2;
                    denominator=n1;
                }
                remainder=numerator%denominator;
                while(remainder!=0)
                {
                    numerator=denominator;
                    denominator=remainder;
                    remainder=numerator%denominator;
                }
                gcd = denominator;
                lcm = n1*n2/gcd;
                System.out.println("GCD of "+n1+" and "+n2+" = "+gcd);
                System.out.println("LCM of "+n1+" and "+n2+" = "+lcm);
                break;

            case 2:
                System.out.println("Enter number to print Fibonacci series");
                int count=sc.nextInt();
                int b1=0,b2=1,b3,i;
                System.out.print(b1+" "+b2);

                for(i=2;i<count;++i)
                {
                    b3=b1+b2;
                    System.out.print(" "+b3);
                    b1=b2;
                    b2=b3;
                }
                break;

            case 3:
                System.out.println("Enter a Number to be Reversed");
                int number = sc.nextInt();
                int reverse = 0;
                while(number != 0)
                {
                    int rem = number % 10;
                    reverse = reverse * 10 + rem;
                    number = number/10;
                }
                System.out.println("The reverse of the given number is: " + reverse);


            default:
                System.out.println("SUCCESSFULLY EXECUTED");
        }
    }
}