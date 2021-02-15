package SimpleLibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class PupilUserBuilder extends UserBuilder {
    List<String> pupilBooks = new ArrayList<>();

    @Override
    void buildId() {
        user.setId(1);
    }

    @Override
    void buildUsername() {
        user.setUsername("Aisha Demeubayeva");
    }

    @Override
    void buildBorrowedBooks() {
        user.setBorrowedBooks(pupilBooks);
    }

    @Override
    void buildStatus() {
        user.setStatus(Status.PUPIL);
    }

    @Override
    void buildMembership() {
        user.setMembership(false);
    }

    @Override
    void borrow() {
        AbstractFactory abstractFactory;
        //creating Alice electronic version
        abstractFactory = FactoryProvider.getFactory("Book");
        Book book1 = (Book) abstractFactory.create("fiction");

        abstractFactory = FactoryProvider.getFactory("BookType");
        BookType bookType =(BookType) abstractFactory.create("Electronic");

        String result = book1.getName() + " " + bookType.getType() + " " + book1.getAgeLimit()+ " " + book1.getGenre();

        pupilBooks.add(result);
    }

    @Override
    double calculate() {
        return pupilBooks.size();
    }
}
