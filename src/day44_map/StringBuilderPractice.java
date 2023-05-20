package day44_map;
/*
    StringBuilder
        It is also an object representation of sequence of characters
        StringBuilder is mutable and CAN be modified
        It is NOT synchronized-NOT thread sage
        We can ONLY create object of StringBuilder by the "new" keyword.
        It is coming from java.lang package

 */
public class StringBuilderPractice {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.reverse();
        System.out.println(stringBuilder);


        stringBuilder.append(2);// .append method edd characters to the end of string
        System.out.println(stringBuilder);

        stringBuilder.append("olleh");
        System.out.println(stringBuilder);

        stringBuilder.delete(0, 5);
        System.out.println(stringBuilder);

        stringBuilder.insert(1, "TEST");
        System.out.println(stringBuilder);


        stringBuilder.replace(5, 7, "-----");
        System.out.println(stringBuilder);

    }

}

/*
String vs StringBuilder vs StringBuffer



IQ:  What is the difference among String, StringBUilder, StringBUffer?
A:

    String
        It IMMUTABLE
        There are two ways we can declare a String
            -By literals
            -By new Keyword



    StringBuilder
        It is also an object representation of sequence of characters
        StringBuilder is mutable and CAN be modified
        It is NOT synchronized-NOT thread sage
        We can ONLY create object of StringBuilder by the "new" keyword.
        It is coming from java.lang package




    StringBuffer
        It is also an object that represent sequence fo Characters
        It is also MUTABLE, once the object is created CAN be modified
        StringBuffer is synchronized-thread safe
        We can create StringBuffer only by "new" keyword.
        It is also coming from java.lang package
 */