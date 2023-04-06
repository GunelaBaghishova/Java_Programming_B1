package day15_string;

public class CharMethod {
    public static void main(String[] args){

        String word = "loop";// 4 characters
         //            0123
        //             1234-----> INVALID OUTPUT
        System.out.println(word.length());

        // method which return us a Char on a given Index - .charAt(int);

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

//        System.out.println(word.charAt(4));

        String longWord = "hhgdhaesdheshdshfdhgsdsgdhasegsdjsd";
    //                     0                                 34
        System.out.println(longWord.length());


        int lastIndex = longWord.length() - 1;
        System.out.println(longWord.charAt(lastIndex));


    }
}
