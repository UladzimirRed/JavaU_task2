package by.epam.task2.entity;

import java.util.Objects;

public class Rock extends MusicalComposition {

    private boolean entryInTheRockAndRollHallOfFame;

    public Rock(boolean entryInTheRockAndRollHallOfFame, String artist, String title, int duration) {
        super(MusicalGenre.ROCK, artist, title, duration);
        this.entryInTheRockAndRollHallOfFame = entryInTheRockAndRollHallOfFame;
    }

    public boolean getEntryInTheRockAndRollHallOfFame() {
        return entryInTheRockAndRollHallOfFame;
    }

    public void setEntryInTheRockAndRollHallOfFame(boolean entryInTheRockAndRollHallOfFame) {
        this.entryInTheRockAndRollHallOfFame = entryInTheRockAndRollHallOfFame;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rock rock = (Rock) o;
        return entryInTheRockAndRollHallOfFame == rock.entryInTheRockAndRollHallOfFame;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), entryInTheRockAndRollHallOfFame);
    }

    @Override
    public String toString() {
        return "Track{" +
                "artist - " + this.getArtist() +
                "; title - " + this.getTitle() +
                "; duration(sec) - " + this.getDuration() +
                "; Genre - " + this.getMusicalGenres() +
                "; Entry In The Rock & Roll Hall Of Fame - " + entryInTheRockAndRollHallOfFame +
                '}';
    }
}