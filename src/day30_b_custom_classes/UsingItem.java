package day30_b_custom_classes;

public class UsingItem {

    public static void main(String[] args) {
        Item fruit1 = new Item();
        //System.out.println(); If you write this line of code and if you do not have toString() method in Item class  ---> it will print out some memory location.
        fruit1.name = "Apple";
        fruit1.price = 3.99;


//        System.out.println("Fruit 1:  " + fruit1.name);
//        System.out.println("Fruit 1 price: $" + fruit1.price);

        System.out.println(fruit1);


        Item fruit2= new Item();
        fruit2.name = "Banana";
        System.out.println("-----------------------------");
        fruit2.price = 2.99;
        System.out.println(fruit2);





}
}
