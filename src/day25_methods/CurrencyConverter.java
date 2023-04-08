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
public class CurrencyConverter {

    public static double currency (String currencyType, double currencyAmount){
        currencyType = currencyType.toLowerCase();

        switch (currencyType){
            case "euro":
               return currencyAmount * 0.91;
            case "yen":
                return currencyAmount * 121.03;
            case "lira":
                return currencyAmount * 14.85;
            case "won":
                return currencyAmount * 1_217.52;
            case "rupee":
                return currencyAmount * 181.45;
            default:
                System.out.println("Not valid currency");
                return 0.0;

        }


    }

    public static void main(String[] args) {


        currency("EurO", 500);
        System.out.println("Your converted currency: " + currency("euro", 500));
        System.out.println("Your converted currency: " + currency("k", 500));
        System.out.println("Your converted currency: " + currency("yeN", 500));

    }


}
