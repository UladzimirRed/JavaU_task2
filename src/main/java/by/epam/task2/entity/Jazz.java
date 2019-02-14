package by.epam.task2.entity;

import java.util.Objects;


public class Jazz extends MusicalComposition {

    private boolean representativeOfAcidJazz;

    public Jazz(String artist, String title, int duration, boolean representativeOfAcidJazz) {
        super(MusicalGenre.JAZZ, artist, title, duration);
        this.representativeOfAcidJazz = representativeOfAcidJazz;
    }

    public boolean isRepresentativeOfAcidJazz() {
        return representativeOfAcidJazz;
    }

    public void setRepresentativeOfAcidJazz(boolean representativeOfAcidJazz) {
        this.representativeOfAcidJazz = representativeOfAcidJazz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Jazz jazz = (Jazz) o;
        return representativeOfAcidJazz == jazz.representativeOfAcidJazz;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), representativeOfAcidJazz);
    }

    @Override
    public String toString() {
        return "Track{" +
                "artist - " + this.getArtist() +
                ", title - " + this.getTitle() +
                ", duration(sec) - " + this.getDuration() +
                ", Genre - " + this.getMusicalGenres() +
                ", Representative Of Acid Jazz - " + representativeOfAcidJazz +
                '}';
    }
}