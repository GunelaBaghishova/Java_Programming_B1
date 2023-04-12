package day27_wrapper_araylist;
/*

    given some string, count the number of uppercase letter, lowercase letters, numbers, and other characters

        aP3d572&*jd@jdJU

    Character.isUpperCase(char) --> checks if a char is uppercase
    Character.isLowerCase(char) --> checks if the char is lowercase
    Character.isDigit(char) --> checks if the character is a number

 */
public class CountCharacters {

    public static void main(String[] args) {

        String s = "aP3d572&*jd@jdJU";

        int lowerCase = 0, upperCase = 0, digits = 0,others = 0;

        for (int i = 0; i < s.length(); i++) {

           if (Character.isUpperCase( s.charAt(i) )){
               upperCase++;

           }else if(Character.isLowerCase( s.charAt(i) )){
               lowerCase++;

           }else if(Character.isDigit( s.charAt(i) )){
               digits++;

           }else{
               others++;

           }
        }

        System.out.println("Upper case: "+ upperCase);
        System.out.println("Lower case: "+ lowerCase);
        System.out.println("Digits: "+ digits);
        System.out.println("Others: "+ others );





    }


}
