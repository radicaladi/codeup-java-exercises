package movies;

public class Movie {
    // fields
    private String name;
    private String category;

    // method
    public String getMovie() {
        return this.name;
    }

    // method
    public String getCategory() {
        return this.category;
    }

    // constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
}
