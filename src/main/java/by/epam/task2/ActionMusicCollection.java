package by.epam.task2;

import by.epam.task2.entity.MusicalCompositions;
import by.epam.task2.util.MusicComporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ActionMusicCollection {

    public List<MusicalCompositions> sortTracksByDuration(List<MusicalCompositions> compositions) {
        List<MusicalCompositions> tracksByDuration = new ArrayList<>(compositions);
        Collections.sort(tracksByDuration, new MusicComporator());
        return tracksByDuration;
    }

    public List<MusicalCompositions> findTracksInTheRange(List<MusicalCompositions> compositions, int minDuration, int maxDuration) {
        List<MusicalCompositions> tracksInRange = new ArrayList<>();
        for (MusicalCompositions mus : compositions) {
            if (mus.getDuration() >= minDuration && maxDuration >= mus.getDuration()) {
                tracksInRange.add(mus);
            }
        }
        return tracksInRange;
    }

//    public List<MusicalCompositions> recordTracksByGenre(List<MusicalCompositions> compositions) {
//        List<MusicalCompositions> tracksByGenre = new ArrayList<>();
//        for (MusicalCompositions mus : compositions) {
//            if (mus.getMusicalGenres().equals(MusicalGenres.HIP_HOP)) {
//                tracksByGenre.add(0, mus);
//            }
//            if (mus.getMusicalGenres().equals(MusicalGenres.JAZZ)) {
//                tracksByGenre.add(1, mus);
//            }
//            if (mus.getMusicalGenres().equals(MusicalGenres.ROCK)) {
//                tracksByGenre.add(2, mus);
//            }
//        }
//        return tracksByGenre;
//    }
}
