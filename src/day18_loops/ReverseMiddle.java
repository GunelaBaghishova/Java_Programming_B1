package day18_loops;
/*
 Given a String with three words separated by spaces. Reverse only the second word and return the modified String
     Ex:
     I love java

     Ouput:
     I evol java
  */

import java.util.Scanner;

public class ReverseMiddle {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter 3 word sentence: ");// I love java
        String str = input.nextLine();              //   012345678910
        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" ");
        String middleWord = str.substring(firstSpace+1,lastSpace);
        String reverse ="";


        for (int i = middleWord.length()-1; i >=0; i--) {
            reverse += middleWord.charAt(i);

        }
        System.out.println(str.substring(0,firstSpace ) +" "+reverse+" "+str.substring(lastSpace+1 )) ;
        













    }
}
