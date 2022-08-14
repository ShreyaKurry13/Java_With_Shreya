package com.company;

class MyThr extends Thread{
    public MyThr(String name){
         super(name);
    }
    public void run() {
        System.out.println("Thankyou! ");
//        while (true) {
//            System.out.println("I am a thread");
//        }
    }
}
public class CWS_73_thread_constructor {
    public static void main(String[] args) {
    MyThr t1 = new MyThr("Shreya");
    MyThr t2 = new MyThr("Shubra");
    t1.start();
    t2.start();
    System.out.println("The id of the thread t is: " +t1.getId());
    System.out.println("The name of the thread t is: " +t1.getName());

    System.out.println("The id of the thread t is: " +t2.getId());
    System.out.println("The name of the thread t is: " +t2.getName());
    }
}
