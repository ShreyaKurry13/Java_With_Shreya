package com.company;
public class BinarySearch {
    static int binary(int [] arr,int s,int e, int target ){
        if(s > e){
            return -1;
        }
        int m = s + (e - s)/2;
        if (arr[m]==target){
            return m;
        }
        if( target < arr[m]){
            return binary(arr,s,m-1,target);
        }
        return binary(arr,m+1,e,target);
    }
    public static void main(String[] args) {
     int [] arr ={1 , 2 , 3 , 4, 5 , 6};
     int target = 5;
        System.out.println(binary(arr,0, arr.length - 1,target));
    }
}
