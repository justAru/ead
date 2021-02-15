package SimpleLibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library library;
    List<Book> pupilBooks  = new ArrayList<>();
    List<Book> studentBooks = new ArrayList<>();

    public static synchronized Library getLibrary() {
        if (library == null) {
            library = new Library();
        }
        return library;
    }

}
