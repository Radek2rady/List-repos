package retake.VideoLibrary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Video> videos1 = new ArrayList<>();
        List<Guest> guests1 = new ArrayList<>();

        Video Titanic = new GrayScale("Titanic", "James Cameron", 1997, 3.99);
        Video Shrek = new Colored("Shrek", " Vicky Jenson and Andrew Adamson", 2001, 6.99);
        Guest g1 = new Guest("Rambo", "Unbeated str", null);
        Guest g2 = new Guest("Rocky", "Guns str", null);
        VideoStore vs = new VideoStore(videos1, guests1);

        videos1.add(Titanic);
        videos1.add(Shrek);
        guests1.add(g1);
        guests1.add(g2);

        g2.getVideo(Titanic);
        g1.getVideo(Shrek);

        System.out.println(g2.toString());
        System.out.println(g1.toString());

        System.out.println(vs.toString());
    }
}
