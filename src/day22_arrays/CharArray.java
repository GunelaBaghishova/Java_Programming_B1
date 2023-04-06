package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        String [] letters = {"l", "o", "o", "p"};
        System.out.println(Arrays.toString(letters));





        String word = "loop";
        // toCharArray();

        char [] convertedWord = word.toCharArray();
        System.out.println(Arrays.toString(convertedWord));
        System.out.println(convertedWord[0]);
        System.out.println(convertedWord[1]);
        System.out.println(convertedWord[2]);
        System.out.println(convertedWord[3]);
        System.out.println("-----------------------------------------------");

        for (char eachCharacter:convertedWord) {
            System.out.println(eachCharacter);

        }
        System.out.println("-----------------");

        String days = "Monday - Sunday"; // ------>  [M, o, n, d, a, y,  , -,  , S, u, n, d, a, y]
        //             0123456.........
        char [] allLetters  = days.toCharArray();

        System.out.println(allLetters  [6]);
        System.out.println(Arrays.toString(allLetters ));






    }
}
