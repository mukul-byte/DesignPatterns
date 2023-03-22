package LldOfNullHandling;

import LldOfNullHandling.vehicle.*;

import static LldOfNullHandling.vehicle.VehicleType.BIKE;
import static LldOfNullHandling.vehicle.VehicleType.CAR;

public class VehicleFactory {
    public static Vehicle getVechicle(VehicleType vehicleType, int tankCapacity){
        if(BIKE.equals(vehicleType)){
            return new Bike(tankCapacity);
        } else if (CAR.equals(vehicleType)) {
            return new Car(tankCapacity);
        }

        return new NullVehicle(0);
    }
}
