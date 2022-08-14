package com.company;

class S{
    public int s;
    public void shreya(){
        return;
    }
    public void method(){
        System.out.println("Method of A");
    }
}
class P extends S{
    @Override
    public void method(){
        System.out.println("Method of B");
    }
}
public class CWS_48_method_overriding {
    public static void main(String[] args) {
        S k = new S();
        k.method();

        P p = new P();
        p.method();
    }
}
