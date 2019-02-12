package by.epam.task2.util;

import by.epam.task2.entity.MusicalCompositions;

import java.util.Comparator;

public class MusicComporator implements Comparator<MusicalCompositions> {
    @Override
    public int compare(MusicalCompositions o1, MusicalCompositions o2) {
        return o1.getDuration() - o2.getDuration();
    }
}
