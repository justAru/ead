package CarsShowroom;

public class Sedan extends Car implements ManAdapter {
    protected Sedan(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public void buildCar() {
        System.out.println("Sedan car building in progress...");
        final double speed = manufacturer.getSpeed();
        System.out.println("Speed: " + speed + " kmh");
        manufacturer.create();
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(manufacturer.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
