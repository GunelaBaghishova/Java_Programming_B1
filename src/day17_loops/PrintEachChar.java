package day17_loops;

public class PrintEachChar {


    public static void main(String[] args) {

      String str = "java is great language";
//
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(1));
//        System.out.println(str.charAt(2));
//        System.out.println(str.charAt(3));

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }


//        String str = "java is great language"; // ---length(); --- > 4
//        //            0123
//
//
//        System.out.println(str.charAt(0));  // j
//        System.out.println(str.charAt(1));
//        System.out.println(str.charAt(2));
//        System.out.println(str.charAt(3));
//
//        System.out.println("-------------");
//        for (int i = 0; i < str.length(); i++) {
//
//            System.out.println(str.charAt(i));








    }
}
