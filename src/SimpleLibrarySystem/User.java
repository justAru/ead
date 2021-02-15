package SimpleLibrarySystem;

import java.util.List;

public class User {
    private int id;
    private Status status;
    private String username;
    private List<String> borrowedBooks;
    private Boolean membership;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMembership(Boolean membership) {
        this.membership = membership;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setBorrowedBooks(List<String> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrow(){};
    public double calculate(){
        return 0;
    };

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", status=" + status +
                ", username='" + username + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                ", membership=" + membership +
                '}';
    }
}
