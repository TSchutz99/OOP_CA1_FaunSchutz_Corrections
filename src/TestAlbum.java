import javax.swing.*;
import java.awt.*;

/* TestAlbum.java
 * By: Faun Schutz
 * Start: 02/11/2020
 * finish: 02/11/2020
 */
public class TestAlbum{
    public static void main(String[] args){
        Song song1 = new Song("Sugar Baby Love", "Rubettes", "Pop", 136, 1977);
        Song song2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
        Song song3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);
        Song song4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);
        Song song5 = new Song("House of Fun", "Madness", "Pop", 178, 1984);

        Song[] allSongs = new Song[5];
        allSongs[0] = song1;
        allSongs[1] = song2;
        allSongs[2] = song3;
        allSongs[3] = song4;
        allSongs[4] = song5;

        Album album1 = new Album("Now that’s what I call music 98", allSongs, "Universal Music", 2016);

        JTextArea textArea = new JTextArea(5, 5);

        Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
        textArea.setFont(textAreaFont);

        textArea.setText(album1.toString() + "\n\nTotal PLaying Time: " + album1.getPlayingTime() + " seconds\n\n\t\tAlbum1Tracks");
        textArea.append(String.format("\n\n%-15s%-25s%-15s", "Track Number", "Title", "Artist"));

        for(int i = 0; i < album1.getTracks().length; i++){
            textArea.append(String.format("\n\n%-15d%-25s%-15s", album1.getTracks()[i].getTrackNumber(), album1.getTracks()[i].getTitle(), album1.getTracks()[i].getArtist()));
        }

        JOptionPane.showMessageDialog(null, textArea, "Album Information", JOptionPane.INFORMATION_MESSAGE);

        album1.playTrack();

        int shuffleConfirm = JOptionPane.showConfirmDialog(null,"Would you like to shuffle Album",
                                                    "Shuffle?", JOptionPane.YES_NO_OPTION);
        if(shuffleConfirm == JOptionPane.YES_OPTION)
            album1.shuffle();

        System.exit(0);
    }
}
