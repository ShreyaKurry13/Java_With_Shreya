package com.company;

import java.security.spec.ECField;

class GM extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Good Morning!!!");
        }
    }
}
class WEL extends Thread{
    @Override
    public void run() {

//        while (true){
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome!!!!");
//        }
    }
}
public class CWS_76_chpt13_ps {
    public static void main(String[] args) {
        GM g = new GM();
        WEL w = new WEL();
        g.setPriority(2);
        w.setPriority(4);
        System.out.println(g.getPriority());
        System.out.println(w.getPriority());
        System.out.println(w.getState());
//        g.start();
        w.start();
        System.out.println(w.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
