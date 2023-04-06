package day17_loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int numOfSum = 0;
        while (num >=0){
            numOfSum = numOfSum + num;// numOfSum += num;
            System.out.println("Sum of the numbers so far: "+ numOfSum);
            System.out.println("Enter number again: ");
            num = input.nextInt();
            if (num <0){
                System.out.println(num + " is a negitive number. That is why the while loop ended.");
            }




        }
    }
}
