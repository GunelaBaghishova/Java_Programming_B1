package day14_string;

public class RecapMethods {


    public static void main(String[] args) {
        String str ="loop";//by literals
        String str2 = new String( "loop");//  by new keyword

        System.out.println("Compare with ==" +(str==str2));//false
        System.out.println("Compare with .equal()" +str.equals(str2)); //false

        System.out.println("Compare with .equal()" +str.equals("looP"));
        System.out.println("Compare with .equal()" +str.equalsIgnoreCase("looP"));
        System.out.println();
        System.out.println();
String word1 = "loop academy";
        System.out.println("To upper case: " +word1);

        String word2 = "LOOP ACADEMY";
        System.out.println("To lower case: " +word2);
    }
}
