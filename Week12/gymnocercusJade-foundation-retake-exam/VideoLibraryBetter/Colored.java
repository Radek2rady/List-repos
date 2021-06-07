package retake.VideoLibrary;

public class Colored extends Video {

    public Colored(String title, String director, int year, double price) {
        super(title, director, year, 6.99);
    }

    @Override
    public Video copy(Video video) {
        // if (tape instanceof Colored) {
        return new Colored(title, director, releaseYear, price);

    }
}
