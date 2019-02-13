package by.epam.task2.action;

import by.epam.task2.entity.MusicalComposition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ActionMusicCollection {

//    public List<MusicalComposition> findDurationOfAllTracks(List<MusicalComposition> compositions) {
//        List<MusicalComposition> durationOfAllTracks = new ArrayList<>(compositions);
//        for (MusicalComposition duration : durationOfAllTracks) {
//            Collections.get
//        }
//        return durationOfAllTracks;
//    }

    public List<MusicalComposition> recordTracksByGenre(List<MusicalComposition> compositions) {
        List<MusicalComposition> trackByGenre = new ArrayList<>(compositions);
        trackByGenre.sort(new Comparator<MusicalComposition>() {
            @Override
            public int compare(MusicalComposition o1, MusicalComposition o2) {
                int byName = o1.getMusicalGenres().toString().compareTo(o2.getMusicalGenres().toString());
                if (byName != 0) {
                    return byName;
                }
                return o1.getDuration() - o2.getDuration();
            }
        });

        return trackByGenre;
    }

    public List<MusicalComposition> findTracksInTheRange(List<MusicalComposition> compositions, int minDuration, int maxDuration) {
        List<MusicalComposition> tracksInRange = new ArrayList<>();
        for (MusicalComposition mus : compositions) {
            if (mus.getDuration() >= minDuration && maxDuration >= mus.getDuration()) {
                tracksInRange.add(mus);
            }
        }
        return tracksInRange;
    }

    public List<MusicalComposition> recordTracksByAlphabet (List<MusicalComposition> compositions) {
        List<MusicalComposition> tracksByAlphabet = new ArrayList<>(compositions);
        tracksByAlphabet.sort(Comparator
        .comparing(MusicalComposition::getMusicalGenres)
        .thenComparing(MusicalComposition::getArtist)
        .thenComparing(MusicalComposition::getTitle));
        return tracksByAlphabet;
    }

}