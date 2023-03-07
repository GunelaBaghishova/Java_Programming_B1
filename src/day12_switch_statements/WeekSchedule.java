package day12_switch_statements;
/*
Enter a day of a week

print which class we have on that day, the time of the class


cover the following as well

 */

import java.util.Scanner;

public class WeekSchedule {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a day of a week");
        String dayOfWeek = input.next();

        String message = "";


        switch(dayOfWeek){
            case "Monday" :
            case "monday":
            case "MONDAY":
            case "Friday":
                message = "We do not have a class";
                break;
            case "Wednesday":
            case "WEDNESSDAY":
            case "Thursday":
                message = "We have Java class at 7pm" ;
                break;
            case "Saturday":
                message = "We have Java class at 9:30 am";
                break;


            default:
                message = "We have soft day with Soft Skills class at 9:30 am";


        }
        System.out.println(  message );


















    }
}
