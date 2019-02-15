package by.epam.task2.util;

import by.epam.task2.entity.*;


public class MusicBuilder {

    private static final String DELIMITER = ";\\s*";

    public static MusicalComposition buildTrack(String line) {

        if (!MusicValidator.validate(line)) {
            return null;
        }

        String[] elements = line.split(DELIMITER);
        MusicalGenre genre = EnumExtractor.findMusicalGenre(elements[0]);

        if (genre == null) {
            return null;
        }

        MusicalComposition compositions;

        switch (genre) {
            case JAZZ:
                compositions = new Jazz(elements[1], elements[2], Integer.parseInt(elements[3]), Boolean.parseBoolean(elements[4]));
                break;
            case ROCK:
                compositions = new Rock(elements[1], elements[2], Integer.parseInt(elements[3]), Boolean.parseBoolean(elements[4]));
                break;
            case HIP_HOP:
                compositions = new HipHop(elements[1], elements[2], Integer.parseInt(elements[3]), Boolean.parseBoolean(elements[4]));
                break;
            default:
                return null;
        }
        return compositions;
    }
}