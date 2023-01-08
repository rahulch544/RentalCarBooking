package org.example.service;

import org.example.bean.RentalCarStore;
import org.example.bean.User;
import org.example.bean.Vehicle;
import org.example.bean.VehicleBooking;
import org.example.constants.BookingStatus;
import org.example.constants.VehicleState;
import org.example.factory.StoreFactory;
import org.example.inventory.VehicleInventory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public  class StoreService {
    public static Map<String,RentalCarStore> rentalCarStoreMap = new HashMap<>();


    public static RentalCarStore createRentalCarStore(String storeName, String location, VehicleInventory vehicleInventory) {
        RentalCarStore rentalCarStore = StoreFactory.createRentalCarStore(storeName,location,vehicleInventory);
        rentalCarStoreMap.put(rentalCarStore.getRentalCarStoreId(),rentalCarStore);
        return rentalCarStore;
    }

    public List<Vehicle> displayAvailableVehicles(String storeId){
            return rentalCarStoreMap.get(storeId).getVehicleInventory().getVehicleMap().values().stream().collect(Collectors.toList());
    }

    public VehicleBooking createBooking(User user, String storeId,String vehicleNumber){
        RentalCarStore rentalCarStore = rentalCarStoreMap.get(storeId);
        Vehicle vehicle = rentalCarStore.getVehicleInventory().getVehicleMap().get(vehicleNumber);
//        validate whether vehicle is present in store
        VehicleBooking vehicleBooking = new VehicleBooking(vehicle, BookingStatus.CONFIRMED,user);
        rentalCarStore.getVehicleInventory().getVehicleMap().get(vehicle.getVehicleNumber()).setVehicleState(VehicleState.NOT_AVAILABLE);
        rentalCarStore.addVehicleBooking(vehicleBooking);
        user.addVehicleBooking(vehicleBooking);
        return vehicleBooking;
    }
    public  String getStoreLocation(String storeId){
        return StoreService.rentalCarStoreMap.get(storeId).getLocation();
    }
}
