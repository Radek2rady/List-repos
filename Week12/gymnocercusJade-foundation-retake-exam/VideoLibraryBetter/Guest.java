package retake.VideoLibrary;

public class Guest {
    protected String name;
    protected String address;
    protected Video video;
    protected boolean hasBorrow;

    public Guest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Guest(String name, String address, Video video) {
        this.name = name;
        this.address = address;
        this.video = video;
        this.hasBorrow = false;
    }

    public void checkVideo(Video video) {
        if (this.hasBorrow) {
            return;
        }
    }

    public Video getVideo(Video titanic) {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        if (this.hasBorrow) {
            return this.name + " is currently borrowing " + this.video;
        } else {
            return this.name + " is not borrowing anything currently.";
        }
    }

    public Video steal(Video video) {
        Video copy = null;
        if (this.hasBorrow) {
            return copy;
        } else
            System.out.println("There is no video available to steal.");
        return null;

    }

}
