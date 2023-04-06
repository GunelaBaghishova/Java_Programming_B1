package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {


String [] str= {"java", "Loop", "while", "Softkils", "HELLO", "bye", "$", "54TEst" };
        System.out.println(Arrays.toString (str));

        System.out.println("-------------------------------");

        Arrays.sort(str);

        System.out.println(Arrays.toString(str));//---->[$, 54Test, HELLO, Loop, Softkils, bye, java, while]
                                                         //1  - characters
                                                        // 2-  numbers               SORT ORDER IN STRING
                                                       //3 - Capital Letters
                                                      // 4 - lower case letters

















    }
    }