import javax.swing.*;

/* By: Faun Schutz
 * TestAlbum.java
 * Start:
 *
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

        // couldn't remember how to do text-area
        String album1Tracks = "\t\tAlbum Tracks\n\n" +
                              "Track Number   Title   Artist\n\n";
        for(int i = 0; i < album1.getTracks().length; i++){
            // ran out of time
        }

        JOptionPane.showMessageDialog(null, album1 + "\n\nTotal PLaying Time: " + album1.getPlayingTime() + "\n\nalbum1Tracks",
                                    "Album Information", JOptionPane.INFORMATION_MESSAGE);

        album1.playTrack();

        int shuffleConfirm = JOptionPane.showConfirmDialog(null,"Would you like to shuffle Album",
                                                    "Shuffle?", JOptionPane.YES_NO_OPTION);
        if(shuffleConfirm == JOptionPane.YES_OPTION)
            album1.shuffle();
        else
            System.exit(0);

        System.exit(0);
    }
}
