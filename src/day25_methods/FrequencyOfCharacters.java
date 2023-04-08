package day25_methods;
/*
Frequency of Character

create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word

Ex:
Input:
    apple, p

Output:
    2

Ex:
Input:
    apple, z

Output:
    0

Ex:
Input:
    aabbaacca, a

Output:
    5
 */
public class FrequencyOfCharacters {


    public static int frequencyOfCharacters (String str, char letter){

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if ( str.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("david", 'd'));


    }



}
