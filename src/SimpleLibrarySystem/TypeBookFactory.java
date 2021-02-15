package SimpleLibrarySystem;

public class TypeBookFactory implements AbstractFactory<BookType> {
    @Override
    public BookType create(String bookType) {
        if ("electronic".equalsIgnoreCase(bookType)) {
            return new Electronic();
        } else if ("bookversion".equalsIgnoreCase(bookType)) {
            return new NonElectronic();
        }
        return null;
    }
}
