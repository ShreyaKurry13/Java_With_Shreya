package com.company;

import java.util.Scanner;
import java.util.Random;

public class CWh_19_chpt4_ps4 {
    public static void main(String[] args) {
        // Problem 1
      /*  int a = 10;
        if (a == 11)
        {
            System.out.println("I am 11");
        }
        else
        {
            System.out.println("I am not 11");
        }*/

        //Problem 2

     /*   float m1 , m2 , m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter physics marks");
        m1 = sc.nextFloat();

        System.out.println("Enter chemistry marks");
        m2 = sc.nextFloat();

        System.out.println("Enter maths marks");
        m3 = sc.nextFloat();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your overall percentage is " +avg);

        if (avg>=40 && m1>=33 && m2>=33 && m3>=33)
        {
            System.out.println("Congratulations! you have been promoted.");
        }
        else
        {
            System.out.println("Sorry,you have been failed.");
        }

      */

        // Problem 3
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();

        if (income<=2.5f)
        {
            tax = tax + 0;
        }
        else if (income>2.5f && income<=5f)
        {
            tax = tax + 0.05f * (income-2.5f);
        }
        else if (income>5f && income<=10.0f)
        {
            tax = tax + 0.05f * (5f-2.5f);
            tax = tax + 0.2f * (income-5f);
        }
        else if (income>10.0f)
        {
            tax = tax + 0.05f * (5f-2.5f);
            tax = tax + 0.2f * (10.0f-5f);
            tax = tax + 0.3f * (income-10.0f);
        }

        System.out.println("The total tax paid by employee is:" +tax);

       */

        // Problem 55
      /*  Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();


        switch (day){
                case 1:
                     System.out.println("Monday");
                     break;

                case 2:
                     System.out.println("Tuesday");
                     break;

                case 3:
                     System.out.println("Wednesday");
                     break;

                case 4:
                     System.out.println("Thursday");
                     break;

                case 5:
                     System.out.println("Friday");
                     break;

                case 6:
                     System.out.println("Saturday");
                     break;

                case 7:
                    System.out.println("Sunday");
                     break;
                } */

        // Problem 5
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if (year%4 == 0)
        {
            System.out.println("It is a leap year");
        } else
        {
            System.out.println("It is not a leap year");
        }
    }

        // Problem 6
  //      Scanner sc = new Scanner(System.in);
   //     System.out.println("Enter the website:");
     //   String website = sc.next();

   //     if (website.endsWith(".com"))
        {
  //          System.out.println("This is a commercial website");
        }
        else if (website.endsWith(".org"))
        {
            System.out.println("This is a organization website");
        }
        else if (website.endsWith(".in"))
        {
            System.out.println("This is an Indian website");
        } */

        Random r = new Random(3);
        int a = r.nextInt();
        System.out.println(a);
    }
}
