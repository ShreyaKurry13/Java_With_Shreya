package com.company;

class shreya{
    private int id;
    private String name;

    public shreya(){
        id = 12;
        name = "Your-good-name";
    }

    public shreya(int myId){
        id = myId;
    }

    public shreya(String myName, int myId){
        name = myName;
        id = myId;
    }

    public String getName(String n){
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


public class CWH_42_constructors {
    public static void main(String[] args) {
     shreya k = new shreya("Arnav",23);
//     k.setId(11);
//     k.setName("ShreyaKurry");
        System.out.println(k.getId());
        System.out.println(k.getName("ShreyaKurry"));
    }
}
