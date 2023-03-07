package day11_if_statements;

import java.util.Scanner;

public class LoginApp {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Please, enter 4 digit pin code: ");
//
//        int userPinCode = input.nextInt();
//        System.out.println("Enter your last 4 SIN digits:");
//        int userSin4Digits= input.nextInt();
//
//        int expectedPinCode= 1234;
//        int expectedSin4Digits =4321;
//        if (userPinCode ==expectedPinCode && userSin4Digits==expectedSin4Digits)
//        {
//            System.out.println("Loggin in successfully");
//        }else{
//        System.out.println("Authentication failed");

        Scanner input =  new Scanner(System.in);
        System.out.print("Please, enter 4 digit pin code: ");
        int userPincode = input.nextInt();

        System.out.print("Enter your last 4 SSN digits: ");
        int userSnn$Digits = input.nextInt();


        int expectedPincode = 1234;
        int expected4SnnDigit = 4321;

// NESTED IF STATEMENT
        if (userPincode == expectedPincode && userSnn$Digits == expected4SnnDigit) {
            System.out.println("Logged in successfully");
        } else {
            System.out.println("Authentication failed!");

            if (userPincode != expectedPincode) {
                System.out.println("You have entered invalid pin code");
            }

            if (userSnn$Digits != expected4SnnDigit) {
                System.out.println("You have entered invalid SNN 4 digits");


            }
        }










    }










}
