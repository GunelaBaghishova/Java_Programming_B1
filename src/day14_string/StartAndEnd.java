package day14_string;

public class StartAndEnd {

    public static void main(String[] args) {

        String str = "Apples";
        boolean result1 = str.startsWith("App");//true
        boolean result2 = str.startsWith("app");//false
        System.out.println("result1"+result1);
        System.out.println("result2="+result2);


        System.out.println(str.startsWith("Apples"));
        System.out.println(str.equals("Apples"));
        System.out.println(str.startsWith("Appls"));




    }
}
