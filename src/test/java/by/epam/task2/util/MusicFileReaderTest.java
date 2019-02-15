package by.epam.task2.util;

import by.epam.task2.exception.FileReadingException;
import org.junit.Assert;
import org.junit.Test;


public class MusicFileReaderTest {


    @Test
    public void readPositiveTest() {
        final String FILE_PATH = "data//dataTest.txt";
        MusicFileReader reader = new MusicFileReader();
        String compositions = String.valueOf(reader.read(FILE_PATH));
        String str = "[Track{artist - The Doors; title - Light My Fire; duration(sec) - 172; Genre - ROCK; Entry In The Rock & Roll Hall Of Fame - true}]";
        Assert.assertEquals(str, compositions);
    }

    @Test(expected = FileReadingException.class)
    public void readExceptionTest() {
        MusicFileReader reader = new MusicFileReader();
        Assert.assertEquals(FileReadingException.class, reader.read(null));
    }
}