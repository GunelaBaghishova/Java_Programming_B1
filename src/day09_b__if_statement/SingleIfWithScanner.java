package day09_b__if_statement;

import java.util.Scanner;

public class SingleIfWithScanner {

    public static void main(String[] args) {





        Scanner input = new Scanner(System.in);

        System.out.println("Why are we studying  Java ");

        String answer = input.nextLine();

        System.out.println(" Is Java fun(true or false)? ");
        boolean answer2 = input.nextBoolean();

// on the next two IF statements, both conditions ere checked.
        if (answer2) {

            System.out.println("Feyruz is really happy");
        }

        if(!answer2){
            System.out.println("Turn your camera on it is time to be grilled");

        }



        // Here if the IF condition is TRUE, the ELSE part is skipped.

        if (answer2) {
            System.out.println("Feyruz is really happy");
        } else {
            System.out.println("Turn your camera on it is time to be grilled");

        }




}



}