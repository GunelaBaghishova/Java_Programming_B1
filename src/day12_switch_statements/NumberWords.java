package day12_switch_statements;
/*

take a number and print the number sa the ward:

    1--->One
    2--->Two
    Note:  I need to put number 1 - 5 (both inclusive) any other number is invalid.
    */
public class NumberWords {

    public static void main(String[] args) {
        int num = 1;
                              // ELSE IF STATEMENT

if(num ==1 ){
    System.out.println("One");
}else if (num == 2){
    System.out.println("Two");
}else if (num == 3){
    System.out.println("Tree");

}else if (num == 4){
    System.out.println("Four");
}else if (num == 5){
    System.out.println("Five");
}else{
    System.out.println("Invalid Input");
}

        System.out.println();
        System.out.println("===================================");


                            // SWITCH STATEMENT
        switch(num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Tree");
                break;
                case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
            System.out.println("Invalid Input");





        }













    }
}
