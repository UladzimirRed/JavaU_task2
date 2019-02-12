package by.epam.task2.util;

import by.epam.task2.entity.MusicalGenres;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnumExtractor {

    private static final Logger LOGGER = LogManager.getLogger(EnumExtractor.class);

    public static MusicalGenres findMusicalGenre(String enumString) {
        if (enumString == null) {
            LOGGER.error("String method parameter is null");
            return null;
        }
        try {
            return MusicalGenres.valueOf(enumString.toUpperCase().replaceAll("-", "_"));
        } catch (IllegalArgumentException e) {
            LOGGER.error(e.getMessage());
            return null;
        }
    }
}
