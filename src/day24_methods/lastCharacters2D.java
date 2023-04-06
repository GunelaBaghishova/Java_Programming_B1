package day24_methods;
/*
    Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

    Ex:

        {"James", "is", "back"}
        {"he", "was", "never", "gone"}
        {"methods", "tomorrow"}

    Output:
        ssk
        esre
        sw

 */
public class lastCharacters2D {

    public static void main(String[] args) {


        String [][] info = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}
        };


        for (String [] eachArr : info) {


            for (String aechWord : eachArr) {

                System.out.print(aechWord.substring(aechWord.length() -1));
//                System.out.println(aechWord.charAt(aechWord.length() -1));

            }
            System.out.println();
        }















    }
}
