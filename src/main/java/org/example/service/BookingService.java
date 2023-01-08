package org.example.service;

import org.example.bean.RentalCarStore;
import org.example.bean.User;
import org.example.bean.Vehicle;
import org.example.bean.VehicleBooking;

import java.util.List;

public class BookingService {
    public List<String> rentalCarStoreId;
    public StoreService storeService;

    public void displayAllAvailableVehiclesByLocation(String Location){

    }
    public VehicleBooking bookVehicle(User user, String storeId,String vehicleNumber){
        return storeService.createBooking(user,storeId,vehicleNumber);
    }

    }


