package day06_b_unary_operators;

public class IncrementExample3 {

    public static void main(String[] args) {

        int i = 5;
        int z = i++;
        System.out.println(i);
        System.out.println(z);

        int a= 10; //a = 10
        int b= a + 1;
        System.out.println(a); //a = 10
        System.out.println(b);//11

        int c = ++a;  //a= 11

        System.out.println(c);

        int d = a++;

        System.out.println(a);
        System.out.println(d);



    }
}
