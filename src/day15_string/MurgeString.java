package day15_string;

public class MurgeString {

    public static void main(String[] args) {

       String a = "abc";
       String b = "xyz";


       String mergeOne = a + b;
       System.out.println(mergeOne);

       String mergeTwo = ""+ a.charAt(0)+ a.charAt(1);
        System.out.println(mergeTwo);
        System.out.println();
        System.out.println();


   mergeTwo += a.charAt(2);
   mergeTwo += b.charAt(0);
   mergeTwo += b.charAt(1);
   mergeTwo += b.charAt(2);

   System.out.println( mergeTwo);





    }
}
