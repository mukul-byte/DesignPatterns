package LldOfNullHandling.vehicle;

public abstract class Vehicle {
    public int tankCapacity;

    public Vehicle(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public abstract int tankCapacity();
}
