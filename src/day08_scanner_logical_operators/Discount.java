package day08_scanner_logical_operators;
//  declare and assign
//          is it the weekend
//          are you a teacher
//          are you a police officer
//          are you a firefighter
//
//          Do you get a discount?
//          Must be a weekend day and you must be one of the given
public class Discount {


    public static void main(String[] args) {


        boolean isItWeekend= true;
        boolean areYouATeacher = false;
        boolean areYouAPoliceOfficer = false;
        boolean areYouAFirefighter = false;

        boolean alligableForDiscuunt;


        alligableForDiscuunt = isItWeekend && (areYouATeacher||areYouAPoliceOfficer ||areYouAFirefighter);
        System.out.println(alligableForDiscuunt);


        alligableForDiscuunt = isItWeekend && areYouATeacher||areYouAPoliceOfficer ||areYouAFirefighter;


        System.out.println(alligableForDiscuunt);











    }
}
