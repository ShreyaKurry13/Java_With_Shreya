package com.company;
public class CWH_31_methods {
    static int logic (int x, int y){
        int z;
        if (x>y){
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
       int a=7;
       int b=9;
       int c;
       c = logic(a,b);
       if (a>b){
           c = a+b;
       }
       else {
           c = (a+b)*5;
       }
       int a1 = 6;
       int b1 = 3;
       int c1;
       c1 = logic(a1,b1);
       if (a1>b1){
           c1 = a1 + b1;
       }
       else {
           c1 = (a1 + b1)*5;
       }
        System.out.println(c);
        System.out.println(c1);
    }
}
