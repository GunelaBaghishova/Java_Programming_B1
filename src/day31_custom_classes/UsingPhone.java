package day31_custom_classes;

public class UsingPhone {

    public static void main(String[] args) {
        Phone phone1= new Phone("IPhone");
        System.out.println(phone1);
        System.out.println("-------------------");

        Phone phone2= new Phone("IPhone", "Apple");
        System.out.println(phone2);
        System.out.println("-------------------");
        Phone phone3= new Phone("IPhone", "Apple",256,16.4);
        System.out.println(phone3);

    }





}
