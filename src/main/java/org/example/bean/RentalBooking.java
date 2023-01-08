package org.example.bean;

import lombok.Data;
import org.example.constants.VehicleType;

@Data
public class RentalBooking {
    private final String bookingId;
    private VehicleType vehicleType;

}
