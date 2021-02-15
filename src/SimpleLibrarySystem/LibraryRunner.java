package SimpleLibrarySystem;

public class LibraryRunner {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();

        librarian.setBuilder(new StudentUserBuilder());
        User user = librarian.buildUser();
        System.out.println(user);

        librarian.setBuilder(new PupilUserBuilder());
        User user1 = librarian.buildUser();
        System.out.println(user1);
    }
}
