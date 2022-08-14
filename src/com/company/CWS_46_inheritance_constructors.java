package com.company;

class Daddy{
    public Daddy(){
        System.out.println("I am father");
    }
    public Daddy(int a){
        System.out.println("I am a constructor daddy of: "+a);
    }
}
class Son extends Daddy{
    public Son(){
        System.out.println("I am son");
    }
    public Son(int a,int b){
        super(a);
        System.out.println("I am constructor son of: "+b);
    }
}
class GrandSon extends Son{
    GrandSon(){
        System.out.println("I am GrandSon");
    }
    GrandSon(int a,int b,int c){
        super(a,b);
        System.out.println("I am constructor of Grandson of: "+c);
    }
}
public class CWS_46_inheritance_constructors {
    public static void main(String[] args) {
//        Daddy d= new Daddy();
//       Son s =new Son(2,3);
          GrandSon g = new GrandSon(1,2,3
          );
    }
}
