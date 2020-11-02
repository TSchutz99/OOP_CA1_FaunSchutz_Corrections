/* By: Faun Schutz
 * Song.java
 * Start:
 *
 */
public class Song {
    private static int trackID = 1;
    private int trackNumber;
    private String title;
    private String artist;
    private String genre;
    private int duration;
    private int releaseYear;

    Song(String title, String artist, String genre, int duration, int releaseYear){
        setTrackNumber(trackNumber);
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setDuration(duration);
        setReleaseYear(releaseYear);
    }

    public String toString(){
        return "Track Number: " + getTrackNumber() + "   Title: " + getTitle() + "   Artist: " + getTitle() +
               "   Genre: " + getGenre() + "  Release year: " + getReleaseYear() + "   Duration: " + getDuration();
    }
    private void setTrackNumber(int trackNumber) {
        this.trackNumber = trackID++;
    }
    public int getTrackNumber() {
        return trackNumber;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public String getArtist(){
        return artist;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return duration;
    }
    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
}
