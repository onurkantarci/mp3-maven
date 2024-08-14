package dev.onurk;

import com.mpatric.mp3agic.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Mp3Util {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the path to the MP3 file: ");
//        String inputPath = scanner.nextLine();
        Path path = Paths.get(args[0]);

        String artist = getArtist(path);
        String year = getYear(path);
        String album = getAlbum(path);
        String genre = getGenre(path);
        String comment = getComment(path);

        System.out.println("Metadata for the MP3 file:");
        System.out.println("Artist: " + (artist != null ? artist : "Unknown"));
        System.out.println("Year: " + (year != null ? year : "Unknown"));
        System.out.println("Album: " + (album != null ? album : "Unknown"));
        System.out.println("Genre: " + (genre != null ? genre : "Unknown"));
        System.out.println("Comment: " + (comment != null ? comment : "None"));
    }

    private static ID3v2 getId3v2Tag(Path path) {
        try {
            Mp3File mp3file = new Mp3File(path);
            return mp3file.getId3v2Tag();
        } catch (IOException | UnsupportedTagException | InvalidDataException e) {
            System.err.println("Error reading MP3 file: " + e.getMessage());
            return null;
        }
    }

    public static String getArtist(Path path) {
        ID3v2 tag = getId3v2Tag(path);
        return tag != null ? tag.getArtist() : null;
    }

    public static String getYear(Path path) {
        ID3v2 tag = getId3v2Tag(path);
        return tag != null ? tag.getYear() : null;
    }

    public static String getAlbum(Path path) {
        ID3v2 tag = getId3v2Tag(path);
        return tag != null ? tag.getAlbum() : null;
    }

    public static String getGenre(Path path) {
        ID3v2 tag = getId3v2Tag(path);
        return tag != null ? tag.getGenreDescription() : null;
    }

    public static String getComment(Path path) {
        ID3v2 tag = getId3v2Tag(path);
        return tag != null ? tag.getComment() : null;
    }
}
