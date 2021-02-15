package SimpleLibrarySystem;

public class Fiction implements Book{
    @Override
    public String getName() {
        return "Alice in Wonderland";
    }

    @Override
    public String getGenre() {
        return "fantasy";
    }

    @Override
    public String getAgeLimit() {
        return "12+";
    }
}
