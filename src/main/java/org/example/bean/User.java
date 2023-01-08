package org.example.bean;

import lombok.Data;
import lombok.Generated;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class User {
    @Generated
    private final String userId;
    private final String userName;
    private License license;
    private List<VehicleBooking> vehicleBookingList;

//    private List<RentalBooking> rentalBookingList;
    public User(String userName){
        userId = UUID.randomUUID().toString();
        this.userName =userName;
        this.vehicleBookingList = new ArrayList<>();
    }

    public void addVehicleBooking(VehicleBooking vehicleBooking){
        vehicleBookingList.add(vehicleBooking);
    }

}
