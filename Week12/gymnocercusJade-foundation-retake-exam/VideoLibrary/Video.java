package retake.VideoLibrary;

public abstract class Video {
    protected String title;
    protected String director;
    protected int releaseYear;
    protected double price;
    protected int numberBorrowedEver;

    protected boolean isBorrowed;

    public Video(String title, String director, int year) {
    }

    public Video copy(Video tape) {
        return tape;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + this.title + '\'' +
                ", director='" + this.director + '\'' +
                ", releaseYear=" + this.releaseYear +
                ", price=" + this.price +
                ", numberBorrowedEver=" + this.numberBorrowedEver +
                ", isBorrowed=" + this.isBorrowed +
                '}';
    }
}
