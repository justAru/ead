package CarsShowroom;

public class EuropeManufacturer implements Manufacturer {
    @Override
    public void create() {
        System.out.println("Manufacturer: Europe\n");
    }

    @Override
    public double getSpeed() {
        return 220;
    }

}
