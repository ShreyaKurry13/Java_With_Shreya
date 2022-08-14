package com.company;
class Teacher {
    String designation = "Teacher";
    String collegeName = "Pvppcoe";
    public void display(){
        System.out.println("designation  of Professor :" +designation );
        System.out.println("collegeName of Professor :" +collegeName);
    }
}
class Professor extends Teacher {
    String mainSubject = "Java";
    String department = "IT";
    public void display1(){
        System.out.println("Main Subject of Professor :" +mainSubject);
        System.out.println("Department of Professor :" +department);
    }
}
class AssociateProfessor extends Teacher {
    String mainSubject = "dbms";
    String department = "IT";
    public void display2(){
        System.out.println("Main Subject of Professor :" +mainSubject);
        System.out.println("Department of Professor :" +department);
    }
}
class AssistantProfessor extends Teacher {
    String mainSubject = "Java Lab ";
    String department = "IT";
    public void display3(){
        System.out.println("Main Subject of Professor :" +mainSubject);
        System.out.println("Department of Professor :" +department);
    }
}
class Inhert{
    public static void main(String args[]){
        Professor p= new Professor();
        AssociateProfessor ap= new AssociateProfessor();
        AssistantProfessor asp = new AssistantProfessor();
        System.out.println("--------------------------------------");
        System.out.println("Calling profressor child class");
        p.display();
        p.display1();
        System.out.println("--------------------------------------");
        System.out.println("Calling AssociateProfessor child class");
        ap.display();
        ap.display2();
        System.out.println("--------------------------------------");
        System.out.println("Calling AssociateProfessor child class");
        asp.display();
        asp.display3();
        System.out.println("--------------------------------------");
    }
}