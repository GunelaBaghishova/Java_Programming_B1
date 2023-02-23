package day06_b_unary_operators;

public class IncrementExample2 {
    public static void main(String[] args) {


        int age = 20;
        System.out.println(age--);//-----> here age still is 20, but when we are going to use it again it will be 19
        System.out.println(age);//19
        System.out.println(++age);//20
        System.out.println(--age);//19
        --age;//18
        System.out.println(--age);



    }
}
