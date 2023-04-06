package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {

        String days = "monday, tuesday, wednesday, thursday, friday, saturday, sunday";

//
//        int  countWords = 0;
//
//        for (int i = 0; i < days.length(); i++) {
//            if (days.charAt(i) == ','){                THIS IS ONE WAY TO COUNT HOW MANY WORDS IN THE STRING
//
//                countWords++;
//            }
//
//        }
//        System.out.println("Total words: "+  (countWords+1));

//


        String [] dayArr = days.split("ay ");

        System.out.println(Arrays.toString(dayArr));



        String [] dayArr2 = days.split("wednesday");

        System.out.println(Arrays.toString(dayArr2));

String month = " jan-feb-march-apr-may-june-july-aug-sept-oct-nov-dec";
String [] monthArr = month.split( "-");

        for (String eachMonth: monthArr) {


            System.out.println(eachMonth.substring(0,1).toUpperCase()+eachMonth.substring(1));
        }










    }
}
