package com.company;

class shoo{
    public int x =1;
    protected int y = 2;
    int z = 3;
    private int a =4;
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class CWS_66_access_modifiers {
    public static void main(String[] args) {
        shoo ac = new shoo();
//        ac.meth();
        System.out.println(ac.x);
        System.out.println(ac.y);
        System.out.println(ac.z);
//        System.out.println(a.a); --> cannot access coz it is a private
    }
}
