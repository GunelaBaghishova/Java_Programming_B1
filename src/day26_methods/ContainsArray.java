package day26_methods;

import my_util.ArrayUtil;

public class ContainsArray {

    public static boolean containArr (int [] arr, int num){

        for (int each : arr) {
            if (each==num){
                return true;
            }
        }
       return false;
    }

    public static void main(String[] args) {

       int [] arr = {1, 2, 3, 66, 81} ;
       int num = 66;

        System.out.println(containArr(arr,num));
        System.out.println(containArr(new int []{1, 2, 3},3));


        ArrayUtil.containArr(new int [] {1,5,6,}, 777);
        System.out.println( ArrayUtil.containArr(new int [] {1,5,6,}, 777));



    }
}
