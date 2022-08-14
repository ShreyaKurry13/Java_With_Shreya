package com.company;
class MyCircle{
    public int radius;
    public int height;
    void circle(int radius){
        this.radius = radius;
        double cirArea = Math.PI * radius * radius;
        System.out.println("Area of circle: "+cirArea);
    }
}
class Cylinder extends MyCircle{
    void cylinder(int radius, int height){
        this.height = height;
        this.radius =radius;
        double volCylinder = Math.PI * radius *radius * height;
        System.out.println("Volume of Cylinder: "+volCylinder);
    }
}

class Rectangle1{
    public int length;
    public int breadth;
    public int height;

    public void setLength(){
        this.length = length;
    }
    public int getLength(int i){
        return length;
    }
    public void setBreadth(){
        this.breadth= breadth;
    }
    public int getBreadth(int i){
        return breadth;
    }
    public void setHeight(){
        this.height=height;
    }
    public int getHeight(int i){
        return height;
    }
    void rectangle(){
        int area = length * breadth;
        System.out.println("Area of Rectangle: "+area);
        return;
    }
}
class cuboid extends Rectangle1{
    void cuboid(){
        int volume = length* breadth * height;
        System.out.println("Volume of Cuboid: "+volume);
        return;
    }
}
class ca extends cuboid{
    ca(){
        System.out.println("Hello");
    }
}

public class CWS_52_chpt10_ps {
    public static void main(String[] args) {
        //Problem 1 & 3
     Cylinder c = new Cylinder();
     c.circle(5);
     c.cylinder(4,3);

     //Problem 2 , 4
//     cuboid c = new cuboid();
//     c.setHeight();
//        System.out.println(c.getLength());
//
//     c.rectangle();
//     c.cuboid();
    }
}
