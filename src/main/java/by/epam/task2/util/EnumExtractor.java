package by.epam.task2.util;

import by.epam.task2.entity.MusicalGenre;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnumExtractor {

    private static final Logger LOGGER = LogManager.getLogger(EnumExtractor.class);

    public static MusicalGenre findMusicalGenre(String enumString) {
        if (enumString == null) {
            LOGGER.error("String method parameter is null");
            return null;
        }
        try {
            return MusicalGenre.valueOf(enumString.toUpperCase().replaceAll("-", "_"));
        } catch (IllegalArgumentException e) {
            LOGGER.error(e.getMessage());
            return null;
        }
    }
}