package org.example.bean;

import lombok.Data;
import org.example.constants.BookingStatus;
import org.example.constants.VehicleState;
import org.example.constants.VehicleType;

@Data
public class Vehicle {
    private final String vehicleNumber;
    private final VehicleType vehicleType;
    private VehicleState vehicleState=VehicleState.AVAILABLE;
}
