package day16_loops;

import org.w3c.dom.ls.LSOutput;

public class PrintsNumber {

    public static void main(String[] args) {

      int n =2;
//
//
//        System.out.println(n);
//
//        while (n <= 100) {
//            System.out.println(n);
//            n++;
//        }




        // print even numbers from 2 to 100
        while(n<=100){

            System.out.println(n);
            n += 2;
        }
        System.out.println("========================================");

         n=2;

            while (n<=100){
               if(n%2==0) {
                   System.out.println(n);
                   n++;
               }
                n++;
            }


    }


        }






