package day27_wrapper_araylist;

import java.util.ArrayList;


public class ArrayListExample {

    public static void main(String[] args) {


        ArrayList <Integer> numbers = new ArrayList<>(); // 10 -------> by default
        System.out.println(numbers.size());
        System.out.println("--------------");

        System.out.println(numbers);
        numbers.add(10);  // once i use add() method, it adds it to the end ot the ArrayList

        System.out.println(numbers);

        numbers.add(-200);// once i use add() method and give argument as -200, it adds it to the end ot the ArrayList
        System.out.println(numbers);

        numbers.add(34);
        numbers.add(400);
        System.out.println(numbers);

        System.out.println(numbers.size());

        // How can I get the element which is in the 1st index?
        // In array to get the specific indexed element we used  arr[1];

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));

        // System.out.println(numbers.get(4));   // Run time exception ---  > IndexOutOfBoundsException


        numbers.add(34);
        System.out.println(numbers);


        numbers.add(2,-200);
        System.out.println(numbers);

        numbers.add(1,77);
        System.out.println(numbers);


    }

}
