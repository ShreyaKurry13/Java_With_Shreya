package com.company;

public class CWH_27_arrays {
    public static void main(String[] args) {
      /*  float[] marks = {98.1f , 78.3f , 9.2f , 76.4f ,87.1f};
        System.out.println(marks.length);
        System.out.println(marks[2]);

        String[] students = {"Shreya","Shubra","TATTI","Beremata","Kurry"};
        System.out.println(students.length);
        System.out.println(students[3]);

       */


        int [] marks = {98, 45, 79, 99, 80};
        // Displaying the array (Naive/simple way)
        System.out.println("Printing using naive way");
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);



        // Displaying the array (For loop)
        System.out.println("Printing using for loop");
        for (int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }


        // Displaying the array (for loop)
        System.out.println("Printing using for loop in reverse order");
        for (int i=marks.length - 1; i>=0;i--){
            System.out.println(marks[i]);
        }


        // Displaying the array (for each loop)
        System.out.println("Printing using for each loop");
        for (int element : marks)
        {
            System.out.println(element);
        }
    }
}
