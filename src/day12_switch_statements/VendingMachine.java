package day12_switch_statements;

import java.util.Scanner;

public class VendingMachine {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the wending machine ");
        System.out.println("Please, select on of the followings: \n\tDrinks\n\tSnacks\n\tGum\n\nEnter: ");

        String selection = input.next();
String massage;

        switch (selection) {
            case "Drinks":
                System.out.print("Your chose drink (click on 1, 2,3): \n\t1) Water\n\t2) Soda\n\t3) Juice\n\nYour number: ");
                int drinkNum = input.nextInt();


                if (drinkNum == 1) {
                    massage = "You have selected water";
                } else if (drinkNum == 2) {

                    massage = "You have selected soda";
                } else if (drinkNum == 3) {
                    massage = "You have selected juice";
                } else {
                    massage = "Invalid input";
                }
                break;
            case "Snack":
                System.out.print("Your chose snack (click on 1, 2,3): \n\t1) Candies\n\t2) Pringles\n\t3) Chips\n\nYour number: ");
                int snackNum = input.nextInt();


                if (snackNum == 1) {
                    massage = "You have selected candies";
                } else if (snackNum == 1) {

                    massage = "You have selected pringles";
                } else if (snackNum == 3) {
                    massage = "You have selected chips";
                } else {
                    massage = "Invalid input";
                }
                break;
            case "Gum":
                System.out.print("Your chose gum (click on 1, 2,3): \n\t1) Dirol \n\t2) Turbo\n\t3) \n\nLove: ");
                int gumNum = input.nextInt();


                if (gumNum == 1) {
                    massage = "You have selected dirol";
                } else if (gumNum == 1) {

                    massage = "You have selected turbo";
                } else if (gumNum == 3) {
                    massage = "You have selected love";
                } else {
                    massage = "Invalid input";

                }
                break;
            default:
                massage = "Not valid selection";
        }

        System.out.println(massage);








    }
}
