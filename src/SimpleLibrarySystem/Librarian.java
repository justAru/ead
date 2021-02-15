package SimpleLibrarySystem;

public class Librarian {
    UserBuilder builder;

    public void setBuilder(UserBuilder builder) {
        this.builder = builder;
    }

    User buildUser(){
        builder.createUser();
        builder.buildId();
        builder.buildUsername();
        builder.buildStatus();
        builder.buildBorrowedBooks();
        builder.buildMembership();
        builder.borrow();
        builder.calculate();

        User user = builder.getUser();
        return user;
    }
}
