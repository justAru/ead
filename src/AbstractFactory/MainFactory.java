package AbstractFactory;

public class MainFactory {

    public static Computer getComputer(MainAbstractFactory factory,ComputerType type){
        return factory.createAnyComputer(type);
    }
}
