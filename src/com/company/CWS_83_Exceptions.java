package com.company;

import java.security.spec.ECField;
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString";
    }

    @Override
    public String getMessage() {
        return" I am getMessage";
    }
}
public class CWS_83_Exceptions {
    public static void main(String[] args) {
        int a = 9;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        if (a<9){
            try {
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
            }
        }
    }
}
