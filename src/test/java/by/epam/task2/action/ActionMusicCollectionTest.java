package by.epam.task2.action;

import by.epam.task2.entity.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ActionMusicCollectionTest {
    private ActionMusicCollection actionMusicCollection = new ActionMusicCollection();
    private MusicalComposition jazz;
    private MusicalComposition rock;
    private MusicalComposition hiphop1;
    private MusicalComposition hiphop2;
    private int durationOfAllTestTracks;

    @Before
    public void setUp() {
        jazz = new Jazz(false, "Armstrong", "song", 250);
        rock = new Rock(false, "Hendrix", "VoodooChile", 905);
        hiphop1 = new HipHop(true, "Beastie Boys", "The Maestro", 172);
        hiphop2 = new HipHop(false, "2pac", "I get Around", 262);
        durationOfAllTestTracks = jazz.getDuration() + rock.getDuration() + hiphop1.getDuration() + hiphop2.getDuration();
    }

//    @Test
//    public void findDurationOfAllTracksTest() {
//        List<MusicalComposition> listTest = new ArrayList<>();
//        int duration = actionMusicCollection.findDurationOfAllTracks(listTest);
//        Assert.assertEquals(duration, durationOfAllTestTracks);
//    }

    @Test
    public void recordTracksByGenreTest() {
        List<MusicalComposition> listTest = new ArrayList<>();
        listTest.add(jazz);
        listTest.add(rock);
        listTest.add(hiphop1);
        listTest.add(hiphop2);
        List<MusicalComposition> musicList = actionMusicCollection.recordTracksByGenre(listTest);
        Assert.assertEquals(MusicalGenre.HIP_HOP, musicList.get(0).getMusicalGenres());
        Assert.assertEquals(MusicalGenre.ROCK, musicList.get(3).getMusicalGenres());
    }


    @Test
    public void findTracksInTheRangeTest() {
        List<MusicalComposition> listTest = new ArrayList<>();
        listTest.add(jazz);
        listTest.add(rock);
        List<MusicalComposition> musicList = actionMusicCollection.findTracksInTheRange(listTest, 60, 360);
        Assert.assertEquals(1, musicList.size());
    }
}