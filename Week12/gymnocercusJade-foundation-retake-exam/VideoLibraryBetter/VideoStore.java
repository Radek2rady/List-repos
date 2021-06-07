package retake.VideoLibrary;

import java.util.List;

public class VideoStore {
    private List<Video> videos;
    private List<Guest> guests;

    public VideoStore(List<Video> videos, List<Guest> guests) {
        this.videos = videos;
        this.guests = guests;
    }


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
        video.numberBorrowedEver++;
    }

    public void returnVideo(Guest guest) {
        Video video = null;
        // guest.nrVideos++;   jake reseni It increases the videos borrowing number if the guest has a video?
        guest.hasBorrow = false;
        video.setBorrowed(false);
    }

    public int getMostOftenBorrowed() {
        // Video video = null;
        int maxBorrowed = 0;
        for (Video video : videos) {
            if (video.numberBorrowedEver > maxBorrowed) {
                maxBorrowed = video.numberBorrowedEver;
            }
        }
        return maxBorrowed;
    }

    @Override
    public String toString() {
        return "The store has " + this.videos.size() + " videos available right now and "
                + this.guests.size() + " guests registered.";
    }
}
