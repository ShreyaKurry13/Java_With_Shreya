package com.company;

class Employee{
        int salary;
        String name;

        public int getSalary(){
            return salary;
        }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class cellphone {
    public void ringing() {
        System.out.println("Ringing.......");
    }

    public void vibrating() {
        System.out.println("Vibrating...........");
    }
    public String name(String myName){
        return myName;
    }
}

class Square1{
    public int side;
    public int area;
    public int perimeter;

    public int Area(){
        area = side * side;
        return area;
    }
    public int Perimeter(){
        perimeter = 4*side;
        return perimeter;
    }
}

class Rectanle{
    int length;
    int breadth;
    public int area1(){
        int area = length * breadth;
        return area;
    }
}

class Circle1{
    double radius;

    public double area3(){
        double area = Math.PI * radius * radius;
        return area;
    }
}

class TommyVecetti{
    public void RockstarGames(){
        System.out.println("Hitting... \nRunning....... \nFiring........");
    }
}



public class CWH_39_chpt8_ps {
    public static void main(String[] args) {
//        Problem 1
//       Employee s = new Employee();
//        s.setName("Shreya");
//        s.salary= 55000;
//        System.out.println( s.getName());
//        System.out.println(s.getSalary());

//        Problem 2
//       cellphone c = new cellphone();
//       c.ringing();
//       c.vibrating();
//       System.out.println(c.name("Tatti insaan"));

//         Problem 3
//           Square1 a = new Square1();
//           a.side = 6;
//           System.out.println("Area of Square: "+a.Area());
//           System.out.println("Perimeter of Square: "+a.Perimeter());

//        Problem 4
//        Rectanle r = new Rectanle();
//        r.length= 5;
//        r.breadth= 8;
//        System.out.println("Area of Rectangle: "+r.area1());

//        Problem 5
//        TommyVecetti t =new TommyVecetti();
//        t.RockstarGames();

//        Problem 6
        Circle1 c =new Circle1();
        c.radius= 6.0f;
        System.out.println("Area of Circle: "+c.area3());

    }
}