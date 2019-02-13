package by.epam.task2.util;

import by.epam.task2.entity.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class MusicBuilder {

    private static final Logger LOGGER = LogManager.getLogger(MusicBuilder.class);
    private static final String DELIMITER = ";\\s*";

    public static MusicalComposition buildMusic(String line) {

        if (!MusicValidator.validate(line)) {
            LOGGER.error("This string in your data is not valid. Please check your data");
            return null;
        }

        String[] elements = line.split(DELIMITER);
        MusicalGenre genre = EnumExtractor.findMusicalGenre(elements[0]);

        if (genre == null) {
            return null;
        }

        if (elements.length != 5) {
            LOGGER.error("Line from file is not valid.");
            return null;
        }

        switch (genre) {
            case JAZZ:
                return buildJazz(elements);
            case ROCK:
                return buildRock(elements);
            case HIP_HOP:
                return buildHipHop(elements);
            default:
                LOGGER.error("No suitable genre in source file");
                return null;
        }
    }

    private static Jazz buildJazz(String[] kindOfGenres) {
        try {
            String artist = kindOfGenres[1];
            String title = kindOfGenres[2];
            int duration = Integer.parseInt(kindOfGenres[3]);
            boolean representativeOfAcidJazz = Boolean.parseBoolean(kindOfGenres[4]);
            return new Jazz(representativeOfAcidJazz, artist, title, duration);
        } catch (NumberFormatException e) {
            LOGGER.error(e.getMessage());
            return null;
        }
    }

    private static Rock buildRock(String[] kindOfGenres) {
        try {
            String artist = kindOfGenres[1];
            String title = kindOfGenres[2];
            int duration = Integer.parseInt(kindOfGenres[3]);
            boolean entryInTheRockAndRollHallOfFame = Boolean.parseBoolean(kindOfGenres[4]);
            return new Rock(entryInTheRockAndRollHallOfFame, artist, title, duration);
        } catch (NumberFormatException e) {
            LOGGER.error(e.getMessage());
            return null;
        }
    }

    private static HipHop buildHipHop(String[] kindOfGenres) {
        try {
            String artist = kindOfGenres[1];
            String title = kindOfGenres[2];
            int duration = Integer.parseInt(kindOfGenres[3]);
            boolean alternativeHipHopMembership = Boolean.parseBoolean(kindOfGenres[4]);
            return new HipHop(alternativeHipHopMembership, artist, title, duration);
        } catch (NumberFormatException e) {
            LOGGER.error(e.getMessage());
            return null;
        }
    }
}