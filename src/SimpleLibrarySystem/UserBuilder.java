package SimpleLibrarySystem;

public abstract class UserBuilder {
    User user;

    void createUser(){
        user = new User();
    }

    abstract void buildId();
    abstract void buildUsername();
    abstract void buildBorrowedBooks();
    abstract void buildStatus();
    abstract void buildMembership();
    abstract void borrow();
    abstract double calculate();

    User getUser(){
        return user;
    }
}
