package org.example;

import org.example.bean.*;
import org.example.constants.LicenseType;
import org.example.constants.VehicleType;
import org.example.factory.StoreFactory;
import org.example.inventory.VehicleInventory;
import org.example.service.StoreService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("***********");
        System.out.println("Creating User.....");
        User userA = new User("Rahul");
        System.out.println(userA);


        System.out.println("***********");
        System.out.println("Creating License.....");
        License license = new License("rc_bike_license");
        license.addLicenseType(LicenseType.TWO_WHEELER);
        license.addLicenseType(LicenseType.FOUR_WHEELER);
        System.out.println(license);

        System.out.println("***********");
        System.out.println("Creating Vehicles.....");
        Vehicle carA = new Vehicle("TS35C1185",VehicleType.CAR);
        Vehicle carB = new Vehicle("TS35C3420",VehicleType.CAR);
        System.out.println(carA);
        System.out.println(carB);


        System.out.println("***********");
        System.out.println("Creating VehicleInventory.....");
        VehicleInventory vehicleInventory = new VehicleInventory();
        vehicleInventory.addVehicle(carA);
        vehicleInventory.addVehicle(carB);
        System.out.println(vehicleInventory);


        System.out.println("***********");
        System.out.println("Creating rentalCarStore.....");
        RentalCarStore rentalCarStore = StoreService.createRentalCarStore("RENTAL_CAR_BOOKING","HYDERABAD",vehicleInventory);
        System.out.println(rentalCarStore);

        StoreService storeService = new StoreService();
        System.out.println("***********");
        System.out.println("Print Available Vehicles");
        System.out.println(storeService.displayAvailableVehicles(rentalCarStore.getRentalCarStoreId()));

        System.out.println("***********");
        System.out.println("Book car with no TS35C1185");
        VehicleBooking vehicleBooking = storeService.createBooking(userA,rentalCarStore.getRentalCarStoreId(),"TS35C1185");
        System.out.println(vehicleBooking);


    }
}