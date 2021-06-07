package retake.VideoLibrary;

import java.util.List;

public class VideoStore {
    private List<Video> videos;
    private List<Guest> guests;


    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void addVideo(Video video) {
        videos.add(video);
    }

    public void borrow(Video video, Guest guest) throws Exception {
        if (guest.hasBorrow) {
            throw new Exception("the guest already has a video borrowed");
        }
        if (video.isBorrowed) {
            throw new Exception("the video is currently not available");
        }
        video.setBorrowed(true);
        guest.setVideo(video);
    }

    public void returnVideo(Guest guest) {
        Video video = null;
        guest.nrVideos++;
        guest.hasBorrow = false;
        video.setBorrowed(false);
    }

    public Video getMostOftenBorrowed() {

        return Video;
    }

    @Override
    public String toString() {
        return "The store has " + this.videos + " videos available right now and "
                + this.guests + " guests registered.";
    }
}
