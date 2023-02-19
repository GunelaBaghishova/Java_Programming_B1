package day05_variables;
///*
//Task:
//    class name: School
//    declare and assign these variables
//        number of students in grade 1
//        number of students in grade 2
//        number of students in grade 3
//        number of students in grade 4
//        number of students in grade 5
//        - > total number of students in your school
//        number of days in a year (have some half day = ~ 100.5)
//        number of snow days in a year (double)
//        average gpa in school (3.5) [ranges 1.0 - 4.0]
//        print all of the variables with unique messages
//*/
public class School {

    public static void main(String[] args) {


        int grade1 = 40;
        int grade2 = 30;
        int grade3 = 35;
        int grade4 = 50 ;
        int grade5 = 44;

        int totalNumberOfStudents = grade1 + grade2+grade3 + grade4 + grade5 ;




        double numbersOfDaysInYear = 100.5;
        double numbersOfSnowDays = 5.5;
        double everageGpsInShool = 3.2;

        System.out.println("Numbers of students in grade 1 = " + grade1);
        System.out.println("Numbers of students in grade 2 = " + grade2);
        System.out.println("Numbers of students in grade 3 = " + grade3);
        System.out.println("Numbers of students in grade 4 = " + grade4);
        System.out.println("Numbers of students in grade 5 = " + grade5);
        System.out.println("Total number of students in school:  " + totalNumberOfStudents );

        System.out.println();

        System.out.println("Numbers Of days in year: " +numbersOfDaysInYear);
        System.out.println("Numbers of snow days in year: " + numbersOfSnowDays);
        System.out.println("Everage Gps In Shool: " +everageGpsInShool);










    }
}
