package day27_wrapper_araylist;

import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
      String year = "2023";

        System.out.println("This year is: " + year);
        System.out.println("Next year will be : " + year+1);
        System.out.println("Next year will be : " + (year+1));


        System.out.println();
        System.out.println();
 // converting String to a primitive data type
        int yearInNum = Integer.parseInt(year);
        System.out.println("This year is: " + yearInNum);
        System.out.println("Next year will be : " + yearInNum+1);
        System.out.println("Next year will be : " + (yearInNum+1));

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your age: \n\t(Ex: I am 23 years old.)");
         String usrInput = input.nextLine();

         String age = usrInput.split(" ")[2];
         int ageAsNum = Integer.parseInt(age);


//
       System.out.println("You will be " + (ageAsNum + 10)+ " years old after 10 years");

















    }
}
