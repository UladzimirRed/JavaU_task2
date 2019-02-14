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
        jazz = new Jazz("Armstrong", "song", 250, false);                      // element [2]
        rock = new Rock("Hendrix", "VoodooChile", 905, false);          // element [3]
        hiphop1 = new HipHop("Beastie Boys", "The Maestro", 172, true);    // element [1]
        hiphop2 = new HipHop("2pac", "I get Around", 262, false);          // element [0}
        durationOfAllTestTracks = jazz.getDuration() + rock.getDuration() + hiphop1.getDuration() + hiphop2.getDuration();
    }

    @Test
    public void findDurationOfAllTracksTest() {

        List<MusicalComposition> listTest = new ArrayList<>();
        listTest.add(jazz);
        listTest.add(rock);
        listTest.add(hiphop1);
        listTest.add(hiphop2);
        int duration = actionMusicCollection.findDurationOfAllTracks(listTest);
        Assert.assertEquals(duration, durationOfAllTestTracks);
    }

    @Test
    public void recordTracksByAlphabet() {

        List<MusicalComposition> listTest = new ArrayList<>();
        listTest.add(jazz);
        listTest.add(rock);
        listTest.add(hiphop1);
        listTest.add(hiphop2);
        List<MusicalComposition> musicList = actionMusicCollection.recordTracksByGenreAndAlphabet(listTest);
        Assert.assertEquals(MusicalGenre.HIP_HOP, musicList.get(0).getMusicalGenres());
        Assert.assertEquals(MusicalGenre.ROCK, musicList.get(3).getMusicalGenres());
        Assert.assertEquals(hiphop2.getArtist(), musicList.get(0).getArtist());
    }

    @Test
    public void findTracksByDurationRangeTest() {
        List<MusicalComposition> listTest = new ArrayList<>();
        listTest.add(jazz);
        listTest.add(rock);
        List<MusicalComposition> musicList = actionMusicCollection.findTracksByDurationRange(listTest, 60, 360);
        Assert.assertEquals(1, musicList.size());
    }
}