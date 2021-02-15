package SimpleLibrarySystem;

public class BookFactory implements AbstractFactory<Book> {
    @Override
    public Book create(String bookType) {
        if ("scientific".equalsIgnoreCase(bookType)) {
            return new Scientific();
        } else if ("fiction".equalsIgnoreCase(bookType)) {
            return new Fiction();
        }
        return null;
    }
}
