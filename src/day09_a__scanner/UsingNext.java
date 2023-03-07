package day09_a__scanner;

import java.util.Scanner;

public class UsingNext {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Today is saturday.");
        System.out.print("What is today class? "); //Java
        String className = input.next();
        System.out.println();


        System.out.print("What month is it? ");
        String month = input.next();
        System.out.println(month);
        System.out.println();

input.nextLine();
        System.out.println("I like " +month + " month");



        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();
        System.out.println("Full name is: " + fullName);














    }
}
