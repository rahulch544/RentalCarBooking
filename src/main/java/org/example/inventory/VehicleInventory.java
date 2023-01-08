package org.example.inventory;

import lombok.Data;
import org.example.bean.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class VehicleInventory {

    Map<String,Vehicle> vehicleMap;

    public VehicleInventory(){
        vehicleMap = new HashMap<>();
    }

    public Boolean addVehicle(Vehicle vehicle){
         vehicleMap.put(vehicle.getVehicleNumber(),vehicle);
         return vehicleMap.containsKey(vehicle.getVehicleNumber());
    }
}
