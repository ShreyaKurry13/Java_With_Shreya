package com.company;

public class CWH_33_varargs {
 /*   static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

  */
    static int sum(int...arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs module!");
        System.out.println("The sum of 2 and 3 is:" +  sum(2,3));
        System.out.println("The sum of 2,3 and 4 is:" + sum(2,3,4));
        System.out.println("the sum of 2,3,4 and 5 is:" + sum(2,3,4,5));
    }
}
