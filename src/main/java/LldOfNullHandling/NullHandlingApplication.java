package LldOfNullHandling;

import LldOfNullHandling.vehicle.Vehicle;

import static LldOfNullHandling.VehicleFactory.getVechicle;
import static LldOfNullHandling.vehicle.VehicleType.BIKE;
import static LldOfNullHandling.vehicle.VehicleType.TRUCK;

public class NullHandlingApplication {
    public static void main(String[] args) {
        Vehicle r15 = getVechicle(BIKE, 20);
        
        //no need of null checks
        //if(r15!=null)
        System.out.println("Tank Capacity of r15 bike is " + r15.tankCapacity());

        Vehicle ashokLeyland = getVechicle(TRUCK, 50);

        //if(ashokLeyland!=null)
        System.out.println("Tank Capacity of ashokLeyland truck is " + ashokLeyland.tankCapacity());
    }
}
