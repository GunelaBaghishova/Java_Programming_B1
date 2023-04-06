package day24_methods;
/*
    make a method that accepts a number / year
    and calculates how old you are
 */
public class Age {

    public static void calculateAge(int bornYear){
       int currentYear = 2023;
       int yourAge = currentYear - bornYear;

        System.out.println("You are " + yourAge + " years old!" );
    }

    public static void calculateAge(int bornYear, int currentYear){
        int currentYe= 2023;
        int yourAge = currentYear - bornYear;

        System.out.println("You are " + yourAge + " years old!" );
    }


    public static void main(String[] args) {


        calculateAge(1990);
        calculateAge(1990,2023);


    }


}
