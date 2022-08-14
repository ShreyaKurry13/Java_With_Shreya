package com.company;

interface MyCamera{
    void takesnap();
    void recordVideo();
    private void bye(){
        System.out.println("Good bye!!!");
    }
    default void hello(){
        System.out.println("Hello, how are you!");
    }
}

interface MyWifi{
    String [] getnetworks ();
    void connectToNetworks(String Network);
}

class MyCellphone{
    void takeCall(int phoneNumber){
        System.out.println("Connecting to..."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }
}

class MySmartPhone extends MyCellphone implements MyWifi,MyCamera{
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
public class CWS_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.takesnap();
        ms.recordVideo();
        String [] ar = ms.getnetworks();
        for (String item : ar){
            System.out.println(item);
        }
        ms.hello();
    }
}
