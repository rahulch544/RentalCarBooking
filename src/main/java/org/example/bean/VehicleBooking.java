package org.example.bean;

import lombok.Data;
import org.example.constants.BookingStatus;

import java.util.Date;
@Data
public class VehicleBooking {
    private Vehicle vehicle;
    private BookingStatus bookingStatus;
    private String currentBookedUserId;
    Date fromDate;
    Date toDate;
    Bill bill;

    public  VehicleBooking(Vehicle vehicle,BookingStatus bookingStatus,User user){
        this.vehicle = vehicle;
        this.bookingStatus = bookingStatus;
        this.currentBookedUserId = user.getUserId();
    }
}
