package by.epam.task2.util;

import by.epam.task2.entity.HipHop;
import by.epam.task2.entity.MusicalComposition;

import org.junit.Assert;
import org.junit.Test;


public class MusicBuilderTest {

    private MusicalComposition hiphop;

    @Test
    public void buildTrackTest() {

        hiphop = new HipHop("Gorillaz", "Tranz", 162, true);
        Assert.assertEquals(hiphop, MusicBuilder.buildTrack("Hip-hop; Gorillaz; Tranz; 162; true"));
    }
}