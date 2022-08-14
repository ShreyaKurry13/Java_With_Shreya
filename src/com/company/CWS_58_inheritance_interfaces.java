package com.company;

interface daddy{
    void dad();
    void mom();
}
interface Child extends daddy{
    void sis();
    void bro();
}

class MyChild implements Child{
    public void dad(){
        System.out.println("Daddy");
    }
    public void mom(){
        System.out.println("Mommy");
    }
    public void sis(){
        System.out.println("Sissy");
    }
    public void bro(){
        System.out.println("Broda");
    }
}
public class CWS_58_inheritance_interfaces {
    public static void main(String[] args) {
  MyChild my = new MyChild();
  my.dad();
  my.mom();
  my.sis();
  my.bro();
    }
}
