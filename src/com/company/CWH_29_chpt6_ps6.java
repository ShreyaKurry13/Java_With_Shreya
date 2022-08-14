package com.company;

public class CWH_29_chpt6_ps6 {
    public static void main(String[] args) {
        //Question 1
      /*  float[] marks = {98.1f , 78.3f , 9.2f , 76.4f ,87.1f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is:"+sum);


        //Question 2
        float[] marks = {98.1f , 78.3f , 9.2f , 76.4f ,87.1f};
        float num = 78.36f;
        boolean isAnArray = false;
        for (float element:marks){
           if (num==element){
               isAnArray = true;
               break;
           }
        }
        if (isAnArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }



        // Queston 3

        float[] marks = {98.1f , 78.3f , 9.2f , 76.4f ,87.1f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is:"+sum/ marks.length);



        // Problem 4
        int[][] mat1 ={{1,2,4},
                       {4,2,6}};
        int[][] mat2 ={{3,5,1},
                       {8,5,4}};
        int[][] result ={{0,0,0},
                       {0,0,0}};
        for (int i=0;i<mat1.length;i++){ //row number of times
            for (int j=0;j<mat1[i].length;j++){ //column number of times
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j]= mat1[i][j] + mat2[i][j];
            }
        }
        for (int i=0;i<mat1.length;i++){ //row number of times
            for (int j=0;j<mat1[i].length;j++){ //column number of times
                System.out.print(result[i][j] + " ");
                result[i][j]= mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }

        // QUESTION 5
        int[] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }


        // QUESTION 6
        int[] arr = {1, 45, 1345, 324, 5, 10};
        int max = 0;
        for (int e:arr) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println("The value of max element is: " + max);



        // QUESTION 7
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE); */

        //QUESTION 8
        int[] arr = {1, 45, 1345, 3240, 5000, 100};
        boolean isSorted = true;
        for (int i = 0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The Array is sorted");
        }
        else {
            System.out.println("The Array is not sorted");
        }

    }
}