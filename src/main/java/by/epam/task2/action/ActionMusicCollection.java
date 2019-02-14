package by.epam.task2.action;

import by.epam.task2.entity.MusicalComposition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ActionMusicCollection {

    public int findDurationOfAllTracks(List<MusicalComposition> compositions) {
        int durationOfAllTracks = 0;
        for (MusicalComposition composition : compositions) {
            durationOfAllTracks += composition.getDuration();
        }
        return durationOfAllTracks;
    }

    public List<MusicalComposition> recordTracksByGenreAndAlphabet(List<MusicalComposition> compositions) {
        List<MusicalComposition> tracksByAlphabet = new ArrayList<>(compositions);
        tracksByAlphabet.sort(Comparator
                .comparing(MusicalComposition::getMusicalGenres)
                .thenComparing(MusicalComposition::getArtist)
                .thenComparing(MusicalComposition::getTitle));
        return tracksByAlphabet;
    }

    public List<MusicalComposition> findTracksByDurationRange(List<MusicalComposition> compositions, int minDuration, int maxDuration) {
        List<MusicalComposition> tracksInRange = new ArrayList<>();
        for (MusicalComposition mus : compositions) {
            if (mus.getDuration() >= minDuration && maxDuration >= mus.getDuration()) {
                tracksInRange.add(mus);
            }
        }
        return tracksInRange;
    }
}