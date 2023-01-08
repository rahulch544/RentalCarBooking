package org.example.bean;

import lombok.Data;
import org.example.inventory.VehicleInventory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class RentalCarStore {
    private String rentalCarStoreId;
    String storeName;
    String location;
    private VehicleInventory vehicleInventory;
    private List<VehicleBooking> vehicleBookingList;

    public RentalCarStore(String storeName,String location,VehicleInventory vehicleInventory){
        this.rentalCarStoreId = UUID.randomUUID().toString();
        this.storeName = storeName;
        this.location = location;
        this.vehicleInventory = vehicleInventory;
        this.vehicleBookingList = new ArrayList<>();
    }

    public void addVehicleBooking(VehicleBooking vehicleBooking){
        this.vehicleBookingList.add(vehicleBooking);
    }

}
