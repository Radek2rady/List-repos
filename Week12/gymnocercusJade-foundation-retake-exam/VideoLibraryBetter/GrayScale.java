package retake.VideoLibrary;

public class GrayScale extends Video {

    public GrayScale(String title, String director, int year, double price) {
        super(title, director, year, 3.99);
    }

    @Override
    public Video copy(Video video) {
        //  if (tape instanceof GrayScale) {
        throw new Error("The Police will find you soon");
    }
}
