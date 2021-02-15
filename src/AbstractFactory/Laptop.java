package AbstractFactory;

public class Laptop implements Computer {
    private String ram;
    private String hdd;
    private String cpu;
    private double size;

    public Laptop(String ram, String hdd, String cpu, double size){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
        this.size=size;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    public double getSize(){
        return this.size;
    }

    public String msg(){
        return "this is laptop created in abstract portable factory";
    }
}
