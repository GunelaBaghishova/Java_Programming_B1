package day07_relational_operators;

public class GiftCard {
    public static void main(String[] args) {

  double giftCard  = 300;

  String itemOne = "Dior ";
  String itemTwo = " Channel";



        System.out.println("I have $" + giftCard +  "  worth of gift card." );

        giftCard -=50;
        System.out.println("After buying "  + itemOne + " I have lett  $" + giftCard  );

        giftCard -=100;
        System.out.println("After buying "  + itemTwo + " I have lett $" + giftCard + " amount on the gift card.");
         giftCard  = 300;
        System.out.println("Now i get a new gift card with amoun %" + giftCard );





    }
}
