package LldOfNullHandling.vehicle;

public class Car extends Vehicle {
    public Car(int tankCapacity) {
        super(tankCapacity);
    }

    @Override
    public int tankCapacity() {
        return super.tankCapacity;
    }
}
