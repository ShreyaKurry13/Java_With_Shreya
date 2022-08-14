package com.company;

class Phone{
    public void greet(){
        System.out.println("Good morning..........");
    }
    public void on(){
        System.out.println("Phone is ringing......");
    }
}
class SmartPhone extends Phone{
      public void welcome(){
          System.out.println("You are welcome");
      }
      @Override
      public void on(){
          System.out.println("SmartPhone is ringing....");
      }
}
public class CWS_49_dynamic_method {
    public static void main(String[] args) {
       Phone p = new SmartPhone();
       p.greet();
       p.on();
    }
}
