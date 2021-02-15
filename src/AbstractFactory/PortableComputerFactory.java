package AbstractFactory;

public class PortableComputerFactory implements MainAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;
    private double size;

    public PortableComputerFactory(String ram, String hdd,
                                     String cpu,double size){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
        this.size=size;
    }

    @Override
    public Computer createAnyComputer(ComputerType type) {
        Computer portable=null;
        switch (type){
            case LAPTOP:
                portable = new Laptop(ram,hdd,cpu,size);
                break;
        }
        return portable;
    }
}
