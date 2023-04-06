package day15_string;
import java.util.Scanner;

public class ShortestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words: ");

//      String wordOne = input.next(), wordTwo = input.next(), wordThree = input.next();  // -- > This is just to remind that we can declare this way as well.
        String wordOne = input.next();
        String wordTwo = input.next();
        String wordThree = input.next();

        String message = "";


        int wordOneLength = wordOne.length(),
                wordTwoLength = wordTwo.length(),
                wordThreeLength = wordThree.length();

        if (wordOne.contains("a") && (wordOneLength <= wordTwoLength && wordOneLength <= wordThreeLength ) ){
            message= wordOne + " is the smallest with \"a\"";
        } else if (wordTwo.contains("a") && (wordTwoLength <= wordOneLength && wordTwoLength <= wordThreeLength ) ){
            message = wordTwo + " is the smallest with \"a\"";
        } else if (wordThree.contains("a") && (wordThreeLength <= wordOneLength && wordThreeLength <= wordTwoLength ) ){
            message = wordThree + " is the smallest with \"a\"";
        } else {
            message = "No single longest word with \"a\"";
        }

        System.out.println(message);
    }
}
