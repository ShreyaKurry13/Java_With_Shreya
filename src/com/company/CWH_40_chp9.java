package com.company;

class MyEmployee{
    private int id;
    private String name;

    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
}
public class CWH_40_chp9 {
    public static void main(String[] args) {
      MyEmployee n = new MyEmployee();
      n.setId(5);
      n.setName("Arnav");
        System.out.println(n.getId());
        System.out.println(n.getName());

    }
}
