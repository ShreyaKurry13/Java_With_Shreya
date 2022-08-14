package com.company;

abstract class papa{
    void papa(){
        System.out.println("I am a constructor of papa");
    }
    void method(){
        System.out.println("Hello");
    }
    abstract public void add();
    abstract public void sub();

}
class child extends papa{
    @Override
    public void add() {
        System.out.println("Good morning..");
    }

    @Override
    public void sub() {
        System.out.println("Good afternoon...");
    }
}
abstract class child1 extends papa{
    public void and(){
        System.out.println("And what??????????");
    }
}

public class CWS_53_abstract_method {
    public static void main(String[] args) {
//      papa p = new papa();
      child c = new child();
//      child1 a = new child1();
        c.add();
        c.sub();
        c.method();
    }
}
