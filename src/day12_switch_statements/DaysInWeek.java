package day12_switch_statements;

import java.util.Scanner;
/*
    Given a day number, find and print the day related to the number

    1- Monday
    2- Tuesday

    6- Saturday
    7- Sunday

    any other number: Not a day
 */
public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day number: ");
        int dayNum = input.nextInt();


        switch (dayNum) {
            case 1:
                System.out.println("1 - Monday");
                break;

            case 2:
                System.out.println("2 - Tuesday");
                break;
            case 3:
                System.out.println("3 - Wednesday");
                break;
            case 4:
                System.out.println("4 - Thursday");
                break;
            case 5:
                System.out.println("5 - Friday");
                break;
            case 6:
            case 7:
                System.out.println(" It is Weekend");
                break;

            default:
                System.out.println("Not a day");
















        }












    }







}
