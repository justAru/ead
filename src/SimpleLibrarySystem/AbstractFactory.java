package SimpleLibrarySystem;

public interface AbstractFactory<T> {
        T create(String bookType) ;
    }
