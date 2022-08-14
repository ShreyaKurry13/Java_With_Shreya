package com.company;
class animal{
    public void animal(){
        System.out.println("I am animal");
    }
}
class derived extends animal{
    public void dog (){
        System.out.println("Hello doggie");
    }
}
public class CWH_45_inheritance {
    public static void main(String[] args) {
     derived d =new derived();
     d.dog();
     d.animal();
    }
}
