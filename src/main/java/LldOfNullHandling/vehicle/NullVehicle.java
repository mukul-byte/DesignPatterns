package LldOfNullHandling.vehicle;

import LldOfNullHandling.vehicle.Vehicle;

public class NullVehicle extends Vehicle {
    public NullVehicle(int tankCapacity) {
        super(tankCapacity);
    }

    @Override
    public int tankCapacity() {
        return 0;
    }
}
