package day18_loops;
/*
/*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
    Input:
    This has multiple words
    Output:
    4
 */

import java.util.Scanner;

public class CountsWords {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);//
        System.out.println("Enter a sentense: ");// This has multiple words
        String sentence = input.nextLine().trim();
int count = 0;


        for (int i = 0; i < sentence.length(); i++) {

           if(sentence.charAt(i) == ' ') {
               count ++;


            }

        }

        System.out.println("The count of words: "+ (count+1));












    }
}
