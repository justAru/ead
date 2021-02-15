package CarsShowroom;

public class USManufacturer implements Manufacturer {
    @Override
    public void create() {
        System.out.println("Manufacture: USA\n");
    }

    @Override
    public double getSpeed() {
        return 268;
    }
}
