package by.epam.task2.controller;

import by.epam.task2.action.ActionMusicCollection;
import by.epam.task2.entity.MusicalComposition;
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
            List<MusicalComposition> compositions = reader.read(FILE_PATH);

            System.out.println();
            System.out.println("NEW MUSIC CD DISK IS:");
            for (MusicalComposition mus : compositions) {
                System.out.println(mus);
            }

            System.out.println();
            System.out.println("Duration of all tracks is :");
//            List<MusicalComposition> durationOfAllTracks = actionMusicCollection.findDurationOfAllTracks(compositions);
//            for (MusicalComposition mus : durationOfAllTracks) {
//                System.out.println(mus.toString());
//            }

            System.out.println();
            System.out.println("CD by musical genre is :");
            List<MusicalComposition> tracksByGenre = actionMusicCollection.recordTracksByGenre(compositions);
            for (MusicalComposition mus : tracksByGenre) {
                System.out.println(mus.toString());
            }

            System.out.println();
            System.out.println("Tracks that have a duration in the given range:" + " (min duration is " + MIN_DURATION + " &" + " max duration is " + MAX_DURATION + ")");
            List<MusicalComposition> shortTracksList = actionMusicCollection.findTracksInTheRange(compositions, MIN_DURATION, MAX_DURATION);
            for (MusicalComposition mus : shortTracksList) {
                System.out.println(mus.toString());
            }

            System.out.println();
            System.out.println("Tracks by alphabet is :");
            List<MusicalComposition> sortedByAlphabetTracks = actionMusicCollection.recordTracksByAlphabet(compositions);
            for (MusicalComposition mus : sortedByAlphabetTracks) {
                System.out.println(mus.toString());
            }

        } catch (FileReadingException e) {
            LOGGER.fatal(e.getMessage());
        }
    }
}