package SimpleLibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class StudentUserBuilder extends UserBuilder {
    List<String> studentBooks = new ArrayList<>();

    @Override
    void buildId() {
        user.setId(1);
    }

    @Override
    void buildUsername() {
        user.setUsername("Aruzhan Demeubayeva");
    }

    @Override
    void buildBorrowedBooks() {
        user.setBorrowedBooks(studentBooks);
    }

    @Override
    void buildStatus() {
        user.setStatus(Status.STUDENT);
    }

    @Override
    void buildMembership() {
        user.setMembership(true);
    }

    @Override
    void borrow() {
        AbstractFactory abstractFactory;
        //creating Alice electronic version
        abstractFactory = FactoryProvider.getFactory("Book");
        Book book1 = (Book) abstractFactory.create("scientific");

        abstractFactory = FactoryProvider.getFactory("BookType");
        BookType bookType =(BookType) abstractFactory.create("Electronic");

        String result = book1.getName() + " " + bookType.getType() + " " + book1.getAgeLimit()+ " " + book1.getGenre();
        studentBooks.add(result);
    }

    @Override
    double calculate() {
        return studentBooks.size();
    }

}
