package com.company;
import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {

    int age;
    System.out.println("Enter your age");
    Scanner sc = new Scanner(System.in);
    age = sc.nextInt();

    switch (age)
    {
        case 18:
            System.out.println("Welcome to adulthood man!");
            break;
        case 23:
            System.out.println("You are gonna get a internship :)");
            break;
        case 60:
            System.out.println("You have to retire now!");
            break;
        default:
            System.out.println("Better go to sleep");
    }

 /*   if (age>55)
    {
        System.out.println("You are genious!");
    }
    else if (age>45)
    {
        System.out.println("You are semi-genious!");
    }
    else if (age>35)
    {
        System.out.println("You are a common human :(");
    }
    else
    {
        System.out.println("You are an idiot ");
    }*/
    }
}
