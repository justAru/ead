package AbstractFactory;

public class StationaryComputerFactory implements MainAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public StationaryComputerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createAnyComputer(ComputerType type) {
        Computer stationary=null;
        switch (type){
            case PC:
                stationary = new PC(ram, hdd, cpu);
                break;
            case SERVER:
                stationary = new Server(ram, hdd, cpu);
                break;
        }
        return stationary;
    }
}
