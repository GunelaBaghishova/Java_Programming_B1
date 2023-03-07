package day12_switch_statements;

import java.util.Scanner;

/*
Ask a user for their gender
    if,n M ---> Print Male restroom
    if,  F----> Print Female restroom
 */
public class MaleOrFemale {

    public static void main(String[] args) {

char letter = 'g';
        switch (letter){
            case 'm':
                case 'M':
                System.out.println("Male Restroom");
                break;
            case 'f':
            case 'F':
                System.out.println("Female Restroom");
                break;
            default:
                System.out.println("Invalid letter");

        }

    }
}
