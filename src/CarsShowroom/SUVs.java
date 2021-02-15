package CarsShowroom;

public class SUVs extends Car implements ManAdapter {
    protected SUVs(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public void buildCar() {
        System.out.println("SUVs car building in progress...");
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
