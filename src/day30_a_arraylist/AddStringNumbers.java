package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
/*

Task:
    	 	Create a method that will accept an ArrayList of numbers in String format,
		add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
Ex:
			Input:
				“123”, “34”, “513”

			Output:
				[ 6, 7, 9 ]
 */
public class AddStringNumbers{


    public static ArrayList <Integer> addNums (ArrayList <String> list){

        ArrayList <Integer> listOfSums = new ArrayList<>();

        for (String each : list) {  // “123”

            int sumOfEach = 0;
            for ( String every: each.split("")){  // ["1", "2", "3"]
                sumOfEach += Integer.parseInt(every);  // 1+2+3 = 6
            }
            listOfSums.add(sumOfEach);
        }

        return listOfSums;
    }

    public static void main(String[] args) {

        System.out.println(addNums(new ArrayList<>(Arrays.asList("123", "34", "513"))));
    }
}
