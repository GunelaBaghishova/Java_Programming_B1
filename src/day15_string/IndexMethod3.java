package day15_string;

public class IndexMethod3 {

    public static void main(String[] args) {

      String str = "definition";
              //    0123456789


        System.out.println("First index of i " + str.indexOf("i"));
        System.out.println("last index of i " + str.lastIndexOf("i"));//7



        System.out.println("last index of i " + str.indexOf("i", 7));//7 - but we have to count

        int firstIndex = str.indexOf("i");
        System.out.println(str.indexOf("i", firstIndex+1));












    }
}
