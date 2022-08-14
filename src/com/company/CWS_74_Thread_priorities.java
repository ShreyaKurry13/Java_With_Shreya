package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run() {
        while (true) {
            System.out.println("Thankyou! " +this.getName());
        }
    }
}
public class CWS_74_thread_priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Shreya1");
        MyThr1 t2 = new MyThr1("Shreya2");
        MyThr1 t3 = new MyThr1("Shreya3");
        MyThr1 t4 = new MyThr1("Shreya4");
        MyThr1 t5 = new MyThr1("Shreya5 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
