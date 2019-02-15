package by.epam.task2.util;

import by.epam.task2.entity.MusicalComposition;
import by.epam.task2.exception.FileReadingException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MusicFileReader {

    private static final Logger LOGGER = LogManager.getLogger(MusicFileReader.class);

    public List<MusicalComposition> read(String pathToFile) {
        if (pathToFile == null) {
            throw new FileReadingException("Null path to file in read method");
        }
        File file = new File(pathToFile);
        List<MusicalComposition> musicList = new ArrayList<>();
        int counter = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                MusicalComposition composition = MusicBuilder.buildTrack(scanner.nextLine());
                counter++;
                if (composition != null) {
                    musicList.add(composition);
                } else {
                    LOGGER.error("The line " + counter + " in your file is not valid. Please, check your data!");
                }
            }
            return musicList;
        } catch (FileNotFoundException e) {
            throw new FileReadingException("Error in reading file: " + e.getMessage(), e);
        }
    }
}