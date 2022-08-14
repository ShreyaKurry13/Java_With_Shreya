package com.company;
interface MyCamera1{
    void takesnap();
    void recordVideo();
    private void bye(){
        System.out.println("Good bye!!!");
    }
    default void hello(){
        bye();
        System.out.println("Hello, how are you!");
    }
}

interface MyWifi1{
    String [] getnetworks ();
    void connectToNetworks(String Network);
}

class MyCellphone1{
    void takeCall(int phoneNumber){
        System.out.println("Connecting to..."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }
}

class MySmartPhone1 extends MyCellphone1 implements MyWifi1,MyCamera1{
    public void takesnap() {
        System.out.println("Taking a snap....");
    }
    public void recordVideo(){
        System.out.println("Recording a 4k video!");
    }
    public String[] getnetworks() {
        System.out.println("Getting the list of networks: ");
        String [] networkList = {"shreya","harry" , "pratham","wireless123"};
        return networkList;
    }
    public void connectToNetworks(String Network){
        System.out.println("Connecting to.."+Network);
    }
}
public class CWS_59_polymorphism_interface {
    public static void main(String[] args) {
        MyCamera1 cam1 = new MySmartPhone1();
        cam1.takesnap();
        cam1.hello();
    }
}
