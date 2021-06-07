package retake.VideoLibrary;

public class Colored extends Video {

    public Colored(String title, String director, int year) {
        super(title, director, year);
        this.price = 6.99;
    }

    @Override
    public Video copy(Video tape) {
        // if (tape instanceof Colored) {
        return new Colored(title, director, releaseYear);

    }
}
