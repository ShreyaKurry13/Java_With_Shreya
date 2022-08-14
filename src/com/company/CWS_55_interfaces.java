package com.company;

interface Bike{
    int s =20;
    void applyBrake(int decrement);
    void goSpeed(int increment);
}
interface Scooty{
    void blowHorn1();
    void goSlow();
}
class HeroBike implements Bike , Scooty{
    public void blowHorn(){
        System.out.println("pee pee pooo pooo");
    }
    public void applyBrake(int decrement) {
        System.out.println("Break is applied...");
    }
    public void goSpeed(int increment) {
        System.out.println("Speed is up");
    }
    public void blowHorn1(){
        System.out.println("Blow the horn...");
    }
    public void goSlow(){
        System.out.println("Go slow,Hurdles ahead");
    }
}
public class CWS_55_interfaces {
    public static void main(String[] args) {
    HeroBike h = new HeroBike();
    h.applyBrake(3);
        System.out.println(h.s);
        h.goSpeed(4);

        h.blowHorn1();
        h.goSlow();
    }
}
