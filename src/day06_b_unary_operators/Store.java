package day06_b_unary_operators;

public class Store {

    public static void main(String[] args) {



        String store = "Target";
        int numberOfTv = 100;

        System.out.println(" I have a  total of "+  numberOfTv + " Tvs");
        System.out.println("A person comes into the store and he bought one Tv");
        ;

        System.out.println("Numbers of Tv left in store:" + --numberOfTv);
        System.out.println("Another person comes in to store abd puts the Tv into his cart");
        System.out.println("Available TV in store " + numberOfTv-- );
        System.out.println("The same person who had a TV in his cart bought the TV");
        System.out.println("Now we have in total " + numberOfTv);




    }
}
