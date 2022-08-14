package com.company;

class First{
    int a;
    public int geta(){
        return a;
    }
    First(int a){
        this.a= a;
    }
    public int returnone(){
        return 1;
    }
}
class second extends First{
    second(int b) {
        super(b);
        System.out.println("I am a constructor");
    }
}
public class CWS_47_this_super {
    public static void main(String[] args) {
        First f= new First(55);
     second c = new second(6);
        System.out.println(f.geta());
    }
}
