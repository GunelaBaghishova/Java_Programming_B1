package day4_variables;
//***************************
//        WELCOME TO THE STORE
//        ***************************
//        _________________________
//
//        Cake			$24
//        Water			$3.99
//        Apple Juice		$7.5
//        Bred			$4.25
//        _________________________
//
//        TOTAL AMOUNT:	$39.74
//        TAX:			$3.9
//
//        GRAND AMOUNT:	$43.64
//        _________________________
//        *******THANK YOU*********
public class ShoppingReceipt2 {
    public static void main(String[]args){



        System.out.println("***************************");
        System.out.println("\tWELCOME TO THE STORE");
        System.out.println("***************************");
        System.out.println("_________________________\n");
        int cake=24;
        double water=3.99;
        double appleJuice= 7.50;
        double bread= 4.25;
        System.out.println("Cake\t\t\t$"+cake);
        System.out.println("Water\t\t\t$"+water);
        System.out.println("Apple Juice\t\t$"+appleJuice);
        System.out.println("Bred\t\t\t$"+bread);
        System.out.println("_________________________\n");
        double totalAmount=39.74;
        double tax=3.90;
        double grandTotal=43.64;
        System.out.println("TOTAL AMOUNT:\t$"+totalAmount);
        System.out.println("TAX:\t\t\t$"+tax);
        System.out.println();
        System.out.println("GRAND AMOUNT:\t$"+grandTotal);
        System.out.println("_________________________");
        System.out.println("*******THANK YOU*********");
    }
}
