package day25_methods;

import my_util.ArrayUtil;

import java.util.Arrays;

public class UsingArrayUtil {

    public static void main(String[] args) {
        int [] arr = {47,74,94};
        System.out.println(ArrayUtil.minNumInArr(arr));
        ArrayUtil.minNumInArr(new int [] {34,4,174,6,9,33,87,});
        System.out.println(ArrayUtil.minNumInArr(new int [] {34,4,174,6,9,33,87,}));

        ArrayUtil.minNumInArrWithSort(new int [] {34,4,174,6,9,33,87,});
        System.out.println(ArrayUtil.minNumInArrWithSort(new int [] {34,4,174,6,9,33,1,87,}));



    }


}
