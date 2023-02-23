package day06_arithmetic_operators;

public class TypeCastin {

    public static void main(String[] args) {
        byte b = 40;
        int i = b;// the byte value automatically (implicitly) converted to int, because byte is smoller than int.

        int i2 = 100;
      //  byte b2=i2; Reassigning, check the data type first. That is why we can not put it this way
        //Reassigning, check the data type first. That is why we can not put it this way
        byte b2 = (byte) i2; //Reassigning, check the data type first. That is why we can not put it this way
        byte b3 = 100; // putting a data typr directly

        System.out.println("be2: " + b2);
        System.out.println("be3: " + b3);

        int i3 = 130;
        byte b4 = (byte) i3 ;
        System.out.println("b4: " +b4) ;


        char letter1 =65;
//        char letter1 = (char) 65;

        char letter2 = 'A';

        System.out.println("letter1: " + letter1); // implicintly casting

        System.out.println("letter2: " + letter2);

        byte b5 = 'B' ;
        char letter3 = (char)b5;
        System.out.println("num: " + letter3);

        byte aa = 5;
        char bb = (char)aa;
        System.out.println("bb:"  + bb);


        int i10 = 100;
        long l1 = i10;

        long l2 = 200;
        int i11 = (int)l2;
        System.out.println("i11:" + i11);

        long l3 = 1_000_000_000_000L;
        int i12= (int)l3;
        System.out.println("i12: " + i12);
        System.out.println();
        double d = 50;

        int i13 = (int) d;

        System.out.println("i13: " +i13);




    }
}
