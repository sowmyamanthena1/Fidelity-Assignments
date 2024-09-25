package com.Assignment2;

public class MainVehicle {
    public static void main(String[] args) {
        Car car = new Car("ABC123", "Toyota", 4);
        Motorcycle motorcycle = new Motorcycle("XYZ456", "Harley Davidson", "V-twin");

        int carParkingHours = 5;
        int motorcycleParkingHours = 3;

        System.out.println("Car Details:");
        car.displayDetails();
        System.out.printf("Parking Fee for %d hours: Rs. %.2f%n", carParkingHours, car.calculateParkingFee(carParkingHours));
        System.out.println();

        System.out.println("Motorcycle Details:");
        motorcycle.displayDetails();
        System.out.printf("Parking Fee for %d hours: Rs. %.2f%n", motorcycleParkingHours, motorcycle.calculateParkingFee(motorcycleParkingHours));
    }

}
