package ch_08_class_ex.ex08;

public class Song {
    private String title, artist;
    private int length;

    public Song () {}

    public Song(String title) {
        this.title = "ATTITUDE";

    }
    public Song(String title, String artist) {
        this.title = "한 페이지가 될 수 있게";
        this.artist = "DAY6";

    }
    public Song(String title, String artist, int length) {
        this.title = "HOT";
        this.artist = "LE SSERAFIM";
        this.length = 100;

    }


    public String toString () {
        return "Song={" + "title='" + title + ", artist='" + artist + ", length='" + length + "}";
    }
}
