package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {

        String word = "       Java ia s great language         ";

        System.out.println(word);

        word = word.trim();
        System.out.println(word);

        word= word.substring(0,word.indexOf(" "));

        System.out.println(word);
        System.out.println("==================================");
        word= "       Java ia s great language         ";
        System.out.println(word);
        String word2= word.trim().substring(0,4).toUpperCase().toLowerCase();
        //String word3= contain("ja").word.trim().substring(0,4).toUpperCase().toLowerCase();------> not valid
        //String word3= word.trim().substring(0,4).toUpperCase().toLowerCase().contain("ja").;------> not valid
        //String word4 = word.indexOf(1)+ "Hello";
        String word5 = word.trim().substring(0,4).toUpperCase().toLowerCase();




        System.out.println(word5);




    }
}
