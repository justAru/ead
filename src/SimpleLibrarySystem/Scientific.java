package SimpleLibrarySystem;

public class Scientific implements Book{
    @Override
    public String getName() {
        return "Harry Potter and the Dealthy Hallows";
    }

    @Override
    public String getGenre() {
        return "fantasy";
    }

    @Override
    public String getAgeLimit() {
        return "14+";
    }
}
