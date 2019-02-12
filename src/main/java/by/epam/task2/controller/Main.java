package by.epam.task2.controller;

import by.epam.task2.ActionMusicCollection;
import by.epam.task2.entity.MusicalCompositions;
import by.epam.task2.exception.FileReadingException;
import by.epam.task2.util.MusicFileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    private static final String FILE_PATH = "data//data.txt";
    private static final int MIN_DURATION = 180;
    private static final int MAX_DURATION = 300;

    public static void main(String[] args) {
        try {
            ActionMusicCollection actionMusicCollection = new ActionMusicCollection();
            MusicFileReader reader = new MusicFileReader();
            List<MusicalCompositions> compositions = reader.read(FILE_PATH);

            System.out.println();
            System.out.println("NEW MUSIC CD DISK IS:");
            for (MusicalCompositions mus : compositions) {
                System.out.println(mus);
            }

            System.out.println();
            System.out.println("CD by duration is :");
            List<MusicalCompositions> cdByDuration = actionMusicCollection.sortTracksByDuration(compositions);
            for (MusicalCompositions mus: cdByDuration) {
                System.out.println(mus.toString());
            }

            System.out.println();
            System.out.println("Tracks that have a duration in the given range:" + " (min duration is " + MIN_DURATION + " &" + " max duration is " + MAX_DURATION + ")");
            List<MusicalCompositions> shortTracksList = actionMusicCollection.findTracksInTheRange (compositions, MIN_DURATION, MAX_DURATION);
            for (MusicalCompositions mus : shortTracksList) {
                System.out.println(mus.toString());
            }

//            System.out.println();
//            System.out.println("rewriting tracks by genre: ");
//            List<MusicalCompositions> tracksByGenre = actionMusicCollection.recordTracksByGenre(compositions);
//            for (MusicalCompositions mus : tracksByGenre) {
//                System.out.println(mus.toString());
//            }

        } catch (FileReadingException e) {
            LOGGER.fatal(e.getMessage());
        }
    }
}
