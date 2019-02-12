package by.epam.task2.util;

import by.epam.task2.entity.MusicalCompositions;
import by.epam.task2.exception.FileReadingException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicFileReader {

    public List<MusicalCompositions> read(String pathToFile) {
        if (pathToFile == null) {
            throw new FileReadingException("Null path to file in read method");
        }
        File file = new File(pathToFile);
        List<MusicalCompositions> CdDisk = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                MusicalCompositions musicList = MusicBuilder.buildMusic(scanner.nextLine());
                if (musicList != null) {
                    CdDisk.add(musicList);
                }
            }
            return CdDisk;
        } catch (FileNotFoundException e) {
            throw new FileReadingException("Error in reading file: " + e.getMessage(), e);
        }
    }
}
