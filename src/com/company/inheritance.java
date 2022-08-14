package com.company;

class hello
{
    void hellodisplay()
    {
        int length;
        int breadth;
        System.out.println("Hello lovieesss");
    }
}
class tatti extends hello
{
    void tattidisplay()
    {
        System.out.println("How do you do?");
    }
    public static void main(String args[])
    {
        tatti obj=  new tatti();
        obj.hellodisplay();
        obj.tattidisplay();
    }
}
