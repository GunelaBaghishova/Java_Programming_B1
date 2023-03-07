package day09_a__scanner;

import java.util.Scanner;

public class Angles {


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        System.out.println("Enter 3 angel numbers: ");
        double degreeOne = input.nextDouble(),
                degreeTwo= input.nextDouble(),
                degreeTree= input.nextDouble();

        //for triangle ---> total degree of inner calculation is 180
        // calculate what is the total  of 3 numbers

        double total = degreeOne + degreeTwo + degreeTree;

        // write a print statement that prints if it is triangle.

        System.out.println("It is triangle: " +(total==180));


        // write a print statement that prints if it is curcle.

        System.out.println("It is circle: " +(total ==360));
        System.out.println("It is eithe triangle or circle: " +(total==180||total==360));












    }
}
