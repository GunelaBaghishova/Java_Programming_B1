package day06_arithmetic_operators;

public class BasicCalculator {

    public static void main (String[] args){

       double num1 = 5;
       double num2 = 4;

//       double addition = 4+5;  ----> hard coded
       double addition = num1+num2; //dynamic
       double subtraction = num1-num2; //dynamic
       double multiplication = num1*num2; //dynamic
       double division = num1/num2; //dynamic
       double reminder = num1%num2; //dynamic

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction );
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division  );
        System.out.println(num1 + " % " + num2 + " = " + reminder);


        System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1  + num2 + " = " + num1 + num2);



    }
}
