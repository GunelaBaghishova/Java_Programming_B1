package day15_string;
/*
            Mr LastName    -Siz
            Mrs LastName   - Ma'am
            Dr LastName    - Doctor

            Jn             - Nice to see you junior

 */
import java.util.Scanner;

public class Title {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name with title");
        String nameAndTitle = input.nextLine();



        nameAndTitle = nameAndTitle.toLowerCase();// we are trying to have one input or different version inputs


        if (nameAndTitle.startsWith("mr") || nameAndTitle.startsWith("mister")){
            System.out.println("Hello Sir");
        }else if(nameAndTitle.startsWith("ms") || nameAndTitle.startsWith("madam")){
            System.out.println("Hello Ma'am");
        }else if(nameAndTitle.startsWith("dr") || nameAndTitle.startsWith("doctor")){
            System.out.println("Hello Doctor");
        }


        if (nameAndTitle.endsWith("jn")){
            System.out.println("Hello Junior ");
        }else if (nameAndTitle.endsWith("sr")){
            System.out.println("Hello Junior ");

        }else {
            System.out.println("Invalid Output");
        }



    }
}
