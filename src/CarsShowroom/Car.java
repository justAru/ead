package CarsShowroom;

public abstract class Car {
    protected Manufacturer manufacturer;

    protected Car(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public abstract void buildCar();

    public abstract double getSpeed();
}
