package day24_o0ffice_hours;

public class Car {

    public static void unlockCar(){
        System.out.println("Unlocking the car");
    }

    public static void openDoor(){
        System.out.println("Opening the door");
    }

    public static void getInCar(){

        System.out.println("Getting in the car\nClothing the door" );
    }

    public static void getReadyToGo(){
        System.out.println("Putting a seatbelt");
        System.out.println("Checking mirrors");
        System.out.println("Turn on music");
        System.out.println("Set up navigation");
    }

    public static void startCar(){
        System.out.println("Starting a car");
    }

    public static void getRead(){
        System.out.println("Putting gear into Driving mode\nStart driving");
    }

    public static void startToDrive(){
        unlockCar();
        openDoor();
        getInCar();
        getRead();
        startCar();
        getReadyToGo();

    }



    public static void main(String[] args){
        startToDrive();
        System.out.println("-------------");
        openDoor();



















    }


}
