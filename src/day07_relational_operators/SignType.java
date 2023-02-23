package day07_relational_operators;

public class SignType {


    /*



     */

    public static void main(String[] args) {

       int  number =  5;


       boolean isNumberPositive = number >=0,
        isNumberNegotive = number <=0,
       isZero = number ==0;
        System.out.println(number + " is bigger then zero " +isNumberPositive );
        System.out.println(number + " is less then zero " + isNumberNegotive);
        System.out.println(number + " is bigger then zero " +isZero );

    }
}
