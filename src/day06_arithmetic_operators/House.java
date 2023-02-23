package day06_arithmetic_operators;

public class House {
    public static void main(String[] args) {

        String houseType = "Single House";
        short numberOfBedrooms = 4;
        byte numberOfBathrooms = 2;
        byte numberOfKitchen = 1;
        boolean isThereABasement = true;
        boolean isThereAnAttic = true;
        boolean isThereAPool = true;
        boolean isHouseOnSale = false;
        double costOfHouse = 999_999;
        String addressZipCode = "47 James street S, Toronto M7B 0C4";
        boolean isParkNearBy = true;
        short schoolRating = 5;


        String houseInfo = "The " + houseType + " on " + addressZipCode + ", for $" + costOfHouse + "\nThe " + houseType + " has " + numberOfBedrooms + " bedrooms, " + numberOfBathrooms + " bathrooms, " + numberOfKitchen + " kitchen." + "\nIt also includes a basement: " + isThereABasement + ", has an attic: " + isThereAnAttic + ", has a pool: " + isThereAPool + ", is on sale: " + isHouseOnSale + ", and has a park: " + isParkNearBy + "\nThe schools in the area have a rating of " + schoolRating;

        System.out.println(houseInfo);



    }
}
