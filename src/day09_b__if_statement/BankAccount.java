package day09_b__if_statement;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance: ");
        double balance = input.nextDouble();
        System.out.println("How much do you want to withdraw? ");
        double withdraw = input.nextDouble();

//        balance -=withdraw;
        balance= balance- withdraw;

        if(balance<0){
            System.out.println("You can not withdraw because balance can not be less than zero.");
        }else{


            System.out.println(" Your new balanse is: " + balance);

        }

//
//        System.out.println();
//        System.out.println(balance);
//        System.out.println("New balnce is " +balance);












    }
}
