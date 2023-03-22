package LldOfNullHandling.vehicle;

public class Bike extends Vehicle {
    public Bike(int tankCapacity){
        super(tankCapacity);
    }
    @Override
    public int tankCapacity() {
        return super.tankCapacity;
    }
}
