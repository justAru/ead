package SimpleLibrarySystem;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){

        if("Book".equalsIgnoreCase(choice)){
            return new BookFactory();
        }
        else if("BookType".equalsIgnoreCase(choice)){
            return new TypeBookFactory();
        }

        return null;
    }
}