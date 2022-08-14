package com.company;
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
//        while (true){
//            System.out.println("Tam a thread");
//        }
    }
}
public class CWS_73_thread_constructors {
    public static void main(String[] args) {
       MyThr t1 = new MyThr("Shreya");
       MyThr t2 = new MyThr("Kurry");
       t1.start();
       t2.start();
       System.out.println("The ID of thread t is: "+t1.getId());
       System.out.println("The ID of thread t is: "+t1.getName());
       System.out.println("The ID of thread t is: "+t2.getId());
       System.out.println("The ID of thread t is: "+t2.getName());
    }
}