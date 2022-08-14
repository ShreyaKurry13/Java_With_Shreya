package com.company;
import java.util.Scanner;
public class Banks {
    public static void main(String[] args) {
        Bank sc = new Bank();
        sc.showMenu();
    }
}
    class Bank {
        Scanner in = new Scanner(System.in);
        int choose, acct, n;
        float bal, dept, with;
        double roi, c;
        String name;


        public void showMenu() {
            do {
                System.out.println("1.create account\n2.Display Details\n3.Deposit Money\n4.Withdraw Money\nEnter the number of choose");
                choose = in.nextInt();
                System.out.println("Your choice number is " + choose);
                switch (choose) {
                    case 1:
                        System.out.println("You are creating your new account");
                        create_account();

                    case 2:
                        System.out.println("Displaying your details");
                        display();
                        break;
                    case 3:
                        System.out.println("You are depositing money please enter your account number and amount to be deposited");
                        deposit();
                        break;
                    case 4:
                        System.out.println("You are withdrawing money please enter your account number and amount to be withdraw");
                        withdraw();
                        break;

                    case 5:
                        System.out.println("Please enter your account number");
                        computeInterest();
                        break;
                    default:
                        System.out.println("Exit");
                }
                System.out.println("\n DO YOU WANT TO CONTINUE ");
                System.out.println("1.YES\n2.NO\n");
                n = in.nextInt();
            }
            while (n == 1);
        }

        public void create_account() {
            System.out.println("Enter the name");
            name = in.next();
            System.out.println("Enter the account number");
            acct = in.nextInt();
            System.out.println("Enter the balance");
            bal = in.nextFloat();
            System.out.println("Enter the rate of interest");
            roi = in.nextFloat();
            System.out.println("Your account created successfully");
        }

        public void display() {
            System.out.println("The name is " + name);
            System.out.println("The account number is " + acct);
            System.out.println("The total balance is " + bal);
            System.out.println("The rate of interest is " + roi);
        }

        public void deposit() {
            System.out.println("Enter the account number");
            acct = in.nextInt();
            System.out.println("Enter the amount to be deposit");
            System.out.println("The amount to be deposited");
            dept = in.nextFloat();
            bal = bal + dept;
            System.out.println("The updated bal is  " + bal);
        }

        public void withdraw() {
            System.out.println("Enter the account number");
            acct = in.nextInt();
            if (bal < 500) {
                System.out.println("Your balance is too low");
            } else {
                System.out.println("Enter the amount to be withdraw");
                System.out.println("The amount to be withdraw");
                with = in.nextFloat();
                bal = bal - with;
                System.out.println("The updated bal is " + bal);
            }
        }

        public void computeInterest() {
            System.out.println("Enter the account number");
            acct = in.nextInt();
            c = (bal / roi) * 100;
            System.out.println("Your interest value is" + c);
        }
    }
