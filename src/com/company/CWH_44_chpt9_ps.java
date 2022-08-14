package com.company;

//class Cylinder{
//    private int radius;
//    private int height;
//    private float length;
//    private float breadth;
//
//    public Cylinder() {
//        this.height = height;
//        this.radius = radius;
//    }
//
//    public Cylinder(float length,float breadth){
//        this.length=length;
//        this.breadth = breadth;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius() {
//        this.radius = radius;
//    }
//
//    public double area(){
//        double surfaceArea = (2* Math.PI* radius*height) + (2* Math.PI*radius*radius);
//        return surfaceArea;
//    }
//
//    public double volume(){
//    double volume = Math.PI * radius*radius*height;
//    return volume;
//    }
//}

class Sphere{
    public int radius;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }

}
public class CWH_44_chpt9_ps {
    public static void main(String[] args) {
        //Problem1
//    Cylinder c = new Cylinder(3,6);
//    c.setHeight(6);
//    c.setRadius(6);
//        System.out.println(c.getHeight());
//        System.out.println(c.getRadius());
        //Problem 2
//        System.out.println("Surface area of Cyclinder: "+c.area());
//        System.out.println("Volume of cyclinder: "+c.volume());

        //Problem 5
        Sphere s = new Sphere();
        s.setRadius(9);
        System.out.println(s.getRadius());

    }

}
