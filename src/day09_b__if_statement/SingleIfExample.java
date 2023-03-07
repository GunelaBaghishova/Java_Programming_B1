package day09_b__if_statement;

public class SingleIfExample {

    public static void main(String[] args) {
if(true
){
    System.out.println("Today is java day");


    }

//        System.out.println("Today is java day");
int maxNumbersOfDays= 28;

        if (maxNumbersOfDays==28) {

            System.out.println("This month is february");

        }
        maxNumbersOfDays=30;
        if (maxNumbersOfDays==28) {

            System.out.println("This month is february");
        }

        int quizResult = 50;
        int passRate = 40;
        if(quizResult >= passRate) {
            System.out.println("Passed the exam.");
        }

        if(quizResult < passRate){

            System.out.println(" Falling the exam.");

        }

        int year = 2021;
        boolean isCovidYears = year >= 2020 && year <= 2022;

if(isCovidYears){
    System.out.println("it was Covid a Covid years");


}




















}




}
