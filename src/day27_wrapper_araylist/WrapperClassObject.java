package day27_wrapper_araylist;

public class WrapperClassObject {

    public static void main(String[] args) {


        int a = 5;

        Integer a2 = 6; // outboxing  : primitive ---->wrapper object

        int a4 = a2;// unboxing : wrapper ---> primitive


        byte b = 2; // narrowing - implicit casting
        Byte b2 = 20; // outboxing ----> primitive to object

//   Integer a3 = new Integer(7);// redundant == deprecated
        System.out.println(a);
        System.out.println(a2);
















}


}
