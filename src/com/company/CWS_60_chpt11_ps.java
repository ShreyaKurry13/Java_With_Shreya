package com.company;

abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    public void write(){
        System.out.println("Writing....");
    }
    public void refill(){
        System.out.println("refill done!!!!!!");
    }
    public void changeNib(){
        System.out.println("Changing the nib!!");
    }
}

class Monkey{
    public void jump() {
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("Bitinggggg");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class human extends Monkey implements basicAnimal{
    public void laugh(){
        System.out.println("laughing...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping....");
    }
}

abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnected();
}
class smartTelephone extends telephone{
    public  void music(){
        System.out.println("Playing music");
    }
    public void camera(){
        System.out.println("Say cheese");
    }
    public void ring(){
        System.out.println("ringing....");
    }
    public void lift(){
        System.out.println("lift..");
    }
    public void disconnected(){
        System.out.println("Disconnecting...");
    }
}

interface tvRemote{
   void on();
   void off();
}
interface smartTvRemote extends tvRemote {
    void watchMovie();
    void watchYoutube();
}
class TV implements smartTvRemote{
    @Override
    public void on() {
        System.out.println("ON TV");
    }

    @Override
    public void off() {
        System.out.println("OFF TV");
    }

    @Override
    public void watchMovie() {
        System.out.println("Watch movie");
    }

    @Override
    public void watchYoutube() {
        System.out.println("Watch youtube");
    }
}
public class CWS_60_chpt11_ps {
    public static void main(String[] args) {
//        Problem 1 & 2
//      fountainPen fp =new fountainPen();
//      fp.write();
//      fp.refill();
//      fp.changeNib();

//        Problem 3
//        human h =new human();
//        h.eat();
//        h.sleep();
//        h.jump();
//        h.bite();

//       Problem 4
//        telephone s = new smartTelephone();
//        s.camera();
//        s.music();
//        s.disconnected();
//        s.ring();
//        s.lift();

//        Problem 5
//          Monkeyl
//          m.laugh(); --> cannot use laugh method coz the reference is monkey which does not have laugh method

//        Problem 6 & 7
        TV t = new TV();
        t.on();
        t.off();
        t.watchMovie();
        t.watchYoutube();
    }
}
