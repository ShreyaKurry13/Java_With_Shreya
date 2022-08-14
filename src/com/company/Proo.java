package com.company;
import java.util.*;
public class Proo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                int ch,k;
                while(true)
                {
                    System.out.println("1. Prime no");
                    System.out.println("2. Palindrome no");
                    System.out.println("3.FiboSeries");
                    System.out.println("4.ArmstrongNumber");
                    System.out.println("5.FactorialNumber");
                    System.out.println("6. Quit");
                    System.out.print("Enter Your Choice : ");
                    ch=sc.nextInt();
                    switch(ch)
                    {
                        case 1:
                            System.out.print("Enter A Number:");
                            k=sc.nextInt();
                            int d=2;
                            boolean b=true;
                            while(d<=k/2)
                            {
                                if(k%d==0)
                                {
                                    b=false;
                                    break;
                                }
                                d++;
                            }
                            if(b)
                            {
                                System.out.print(k + " is a prime Number");
                            }
                            else
                            {
                                System.out.print(k + " is not a prime Number");
                            }
                            break;
                        case 2:
                            System.out.print("Enter A Number:");
                            k=sc.nextInt();
                            int rev=0,temp=k;
                            while(temp>0)
                            {
                                rev = (rev*10) + (temp%10);
                                temp /= 10;   // temp=temp/10
                            }
                            if(k==rev)
                            {
                                System.out.println(k + " is a palindrom No.");
                            }
                            else
                            {
                                System.out.println(k + " is not a palindrom No.");
                            }
                            break;
                        case 3:
                            System.out.print("Please enter length: ");
                            k = sc.nextInt();
                            int[] num = new int[k];
                            num[0] = 0;
                            num[1] = 1;
                            for (int i = 2; i < k; i++)
                            {
                                num[i] = num[i-1] + num[i-2];
                            }
                            System.out.println("Fibonacci Series: ");
                            for (int i = 0; i < k; i++) {
                                System.out.print(num[i] + " ");
                            }
                            break;
                        case 4:
                            int number , originalNumber, remainder, result = 0;
                            System.out.println("Enter a Number");
                            number=sc.nextInt();

                            originalNumber = number;

                            while (originalNumber != 0)
                            {
                                remainder = originalNumber % 10;
                                result += Math.pow(remainder, 3);
                                originalNumber /= 10;
                            }

                            if(result == number)
                            {
                                System.out.println(number + " is an Armstrong number.");
                            }
                            else
                            {
                                System.out.println(number + " is not an Armstrong number.");

                            }
                            break;
                        case 5:
                            long n,fact=1;
                            System.out.println("enter number");

                            n=sc.nextLong();
                            int i=1;
                            while(i<=n)
                            {
                                fact=fact*i;
                                i++;
                            }
                        {
                            System.out.println("fact="+fact);
                        }
                        break;
                        case 6:System.exit(0);
                        default: System.out.println("Wrong Entry");
                    }
                }
            }
        }


