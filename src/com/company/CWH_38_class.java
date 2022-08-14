package com.company;

class faltu{
    int age;
    String name;
    public void details(){
        System.out.println("My age is: "+age);
        System.out.println("My name is: "+name);
    }
}
public class CWH_38_class {
    public static void main(String[] args) {
        System.out.println("This is our own custom class");
       faltu bc = new faltu();
       faltu ac = new faltu();
       bc.age=20;
       bc.name= "Shreya";

       ac.age = 19;
       ac.name = "Tatti";

       bc.details();
       ac.details();

    }
}
