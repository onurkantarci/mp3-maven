package dev.onurk;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

public class Mp3UtilTest {

    @Test
    void getArtist_shouldBe_KraftClub() {
        String artist = Mp3Util.getArtist(Paths.get("./my.mp3"));
        String year = Mp3Util.getYear(Paths.get("./my.mp3"));
        String album = Mp3Util.getAlbum(Paths.get("./my.mp3"));
        String genre = Mp3Util.getGenre(Paths.get("./my.mp3"));
        String comment = Mp3Util.getComment(Paths.get("./my.mp3"));

        System.out.println("Artist: " + artist);
        System.out.println("Year: " + year);
        System.out.println("Album: " + album);
        System.out.println("Genre: " + genre);
        System.out.println("Comment: " + comment);
    }
}
