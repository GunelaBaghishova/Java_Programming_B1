package day15_string;

import java.util.Scanner;

public class FirsAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.println(sentence.length());

        System.out.println("First Char: " + sentence.charAt(0));
        System.out.println("Last Char: " + sentence.charAt(sentence.length() - 1));
//        System.out.println("Last Char: " + sentence.charAt(--length));



    }
}
