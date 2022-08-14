package com.company;

class MyThreadRunnable implements Runnable{
    public void run(){
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
        System.out.println("Thread 1");
    }
}
class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
        System.out.println("Thread 2");
    }
}
public class CWS_71_runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable1 bullet2 = new MyThreadRunnable1();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
