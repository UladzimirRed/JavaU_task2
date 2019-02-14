package by.epam.task2.util;

import by.epam.task2.entity.*;


public class MusicBuilder {

    private static final String DELIMITER = ";\\s*";

    public static MusicalComposition buildMusic(String line) {

        if (!MusicValidator.validate(line)) {
            return null;
        }

        String[] elements = line.split(DELIMITER);
        MusicalGenre genre = EnumExtractor.findMusicalGenre(elements[0]);

        if (genre == null) {
            return null;
        }

        switch (genre) {
            case JAZZ:
                return new Jazz(elements[1], elements[2], Integer.parseInt(elements[3]), Boolean.parseBoolean(elements[4]));
            case ROCK:
                return new Rock(elements[1], elements[2], Integer.parseInt(elements[3]), Boolean.parseBoolean(elements[4]));
            case HIP_HOP:
                return new HipHop(elements[1], elements[2], Integer.parseInt(elements[3]), Boolean.parseBoolean(elements[4]));
            default:
                return null;
        }
    }
}