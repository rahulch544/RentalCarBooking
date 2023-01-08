package org.example.factory;

import org.example.bean.RentalCarStore;
import org.example.inventory.VehicleInventory;

import java.util.HashMap;
import java.util.Map;

public class StoreFactory {
//    public static Map<String,RentalCarStore> rentalCarStoreMap = new HashMap<>();

    public static RentalCarStore createRentalCarStore(String storeName, String location, VehicleInventory vehicleInventory){
        RentalCarStore  rentalCarStore = new RentalCarStore(storeName,location,vehicleInventory);
//        rentalCarStoreMap.put(rentalCarStore.getRentalCarStoreId(),rentalCarStore);
        return rentalCarStore;
    }

}
