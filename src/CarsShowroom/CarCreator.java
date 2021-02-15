package CarsShowroom;

public class CarCreator {
    public static void main(String[] args) {

        Car [] cars = new Car[]{
                new Sedan(new EuropeManufacturer()),
                new LuxurySportCar(new USManufacturer()),
                new LuxurySportCar(new EuropeManufacturer()),
                new Minivan(new USManufacturer()),
                new Minivan(new EuropeManufacturer()),
                new SUVs(new USManufacturer()),
                new SUVs(new EuropeManufacturer())
        };

        for (Car car : cars) {
            car.buildCar();
        }
    }
}
