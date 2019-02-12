package by.epam.task2.action;

import by.epam.task2.ActionMusicCollection;
import by.epam.task2.entity.Jazz;
import by.epam.task2.entity.MusicalCompositions;
import by.epam.task2.entity.Rock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ActionMusicCollectionTest {
    private ActionMusicCollection actionMusicCollection = new ActionMusicCollection();
    private MusicalCompositions jazz;
    private MusicalCompositions rock;

    @Before
    public void setUp() {
        jazz = new Jazz(false, "Armstrong", "song", 250);
        rock = new Rock(false, "Hendrix", "VoodooChile", 905);
    }

    @Test
    public void sortTracksByDuration() {
        List<MusicalCompositions> listTest = new ArrayList<>();
        listTest.add(rock);
        listTest.add(jazz);
        List<MusicalCompositions> musicList = actionMusicCollection.sortTracksByDuration(listTest);
        Assert.assertTrue(musicList.get(0).getDuration() < musicList.get(1).getDuration());
    }

    @Test
    public void findTracksInTheRangeTest() {
        List<MusicalCompositions> listTest = new ArrayList<>();
        listTest.add(jazz);
        listTest.add(rock);
        List<MusicalCompositions> musicList = actionMusicCollection.findTracksInTheRange(listTest, 60, 360);
        Assert.assertEquals(1, musicList.size());
    }
}
