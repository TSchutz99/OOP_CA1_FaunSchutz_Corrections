import javax.swing.*;

/* Album.java
 * By: Faun Schutz
 * Start: 02/11/2020
 * finish: 02/11/2020
 */
public class Album {
    private String name;
    private Song[] tracks;
    private String Producer;
    private int releaseYear;

    Album(String name, Song[] tracks, String producer, int releaseYear){
        setName(name);
        setTracks(tracks);
        setProducer(producer);
        setReleaseYear(releaseYear);
    }

    public String toString(){
        return "Name: " + getName() + "\n\nProducer: " + getProducer() + "\n\nRelease Year: " + getReleaseYear()+ "\n\nNumber of Tracks: " + getNumberOfTracks();

    }
    public void setName(String name) {
        if(name.equals(""))
            name = "No name specified";
        else
            this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }
    public Song[] getTracks() {
        return tracks;
    }
    public void setProducer(String producer) {
        Producer = producer;
    }
    public String getProducer() {
        return Producer;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public int getNumberOfTracks(){
        return tracks.length;
    }

    public int getPlayingTime(){
        int PlayingTime = 0;
        for(int i = 0; i < tracks.length; i++){
            PlayingTime += tracks[i].getDuration();
        }
        return PlayingTime;
    }
    public void playTrack(){
        int requestedTrack = Integer.parseInt(JOptionPane.showInputDialog("Which track would you like to play"));

        if(requestedTrack < 1 && requestedTrack > tracks.length)
            JOptionPane.showMessageDialog(null, "An invalid track number was Supplied!",
                                            "Bad Track Number", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Now playing track - details are as follows: \n\n" + tracks[requestedTrack -1].toString());
    }
    public void shuffle(){
        String output = "Shuffled playlist is as follow!";

        Song[] shuffleSongs = new Song[tracks.length];
        boolean[] alreadypicked = new boolean[tracks.length];

        for(int i = 0; i < tracks.length; i++){
            int randomnumber = (int)(Math.random() * tracks.length);

            while(alreadypicked[randomnumber] == true){
                randomnumber = (int)(Math.random() * tracks.length);
            }

            shuffleSongs[i] = tracks[randomnumber];
            alreadypicked[randomnumber] = true;
            output += "\n\n" + shuffleSongs[i].toString();
        }

        JOptionPane.showMessageDialog(null, output, "Shuffled Playlist", JOptionPane.INFORMATION_MESSAGE);
    }
}
