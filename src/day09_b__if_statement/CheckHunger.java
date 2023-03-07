package day09_b__if_statement;

import java.util.Scanner;

public class CheckHunger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ruslan are you hungry(true or falls)");
        boolean isHungry = input.nextBoolean();

        if(isHungry){
            System.out.println("Lets go to Texas DeBrazil");
        } else {

            System.out.println("I cant not stay eating anything. Give me some DOLMA");
        }



























    }
}
