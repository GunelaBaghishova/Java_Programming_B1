package day17_loops;
/*
        /*
         ask user enter a number

            check number if lower than my guessed number --> it is too loo

            check number if higher than my guessed number --> it is too high

            if it is correct guess --- > end the loop and print "You guessed correctly.

        */

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int ourSecretNumber =34;
        int guessNumber;

        do {
            System.out.println("Guess a number (1 - 100) to find my number: ");
             guessNumber = input.nextInt();


            if (guessNumber < ourSecretNumber) {
                System.out.println("its too low");
            } else if (guessNumber > ourSecretNumber) {
                System.out.println("its too high");
            }

        }while(guessNumber!=ourSecretNumber);
        System.out.println("You guessed the correct number which is: " + ourSecretNumber);



    }
}
