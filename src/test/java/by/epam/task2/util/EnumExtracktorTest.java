package by.epam.task2.util;

import by.epam.task2.entity.MusicalGenres;
import org.junit.Assert;
import org.junit.Test;

public class EnumExtracktorTest {

    @Test
    public void findMusicalGenreTest (){
        Assert.assertEquals(EnumExtractor.findMusicalGenre("jAZz"), MusicalGenres.JAZZ);
    }

    @Test
    public void findMusicalGenreNullTest (){
        Assert.assertNull(EnumExtractor.findMusicalGenre(null));
    }


    @Test
    public void findMusicalGenreException () {
        Assert.assertNull(EnumExtractor.findMusicalGenre("Techno"));
    }
}
