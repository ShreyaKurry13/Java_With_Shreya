package com.company;
import java.util.Scanner;
public class CWH_expt_3 {
    public static void main(String[] args) {
        int a,b,c,d,f=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the values of a ,b ,c : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=(b*b)-(4*a*c);
        if(d==0)
        {
            System.out.println("Roots are real and Equal");
            f=1;
        }
        else if(d>0)
        {
            System.out.println("Roots are real and UnEqual");
            f=1;
        }
        else
            System.out.println("Roots are imaginary");
        if(f==1)
        {
            float r1=(float)(-b+Math.sqrt(d))/(2*a);
            float r2=(float)(-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots are :   "+r1+" ,"+r2);
        }
    }
}
