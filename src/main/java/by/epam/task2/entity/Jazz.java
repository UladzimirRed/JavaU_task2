package by.epam.task2.entity;

import java.util.Objects;

public class Jazz extends MusicalCompositions {

    private boolean representativeOfAcidJazz;

    public Jazz(boolean representativeOfAcidJazz, String artist, String title, int duration) {
        super(MusicalGenres.JAZZ, artist, title, duration);
        this.representativeOfAcidJazz = representativeOfAcidJazz;
    }

    public boolean isRepresentiveOfAcidJazz() {
        return representativeOfAcidJazz;
    }

    public void setRepresentiveOfAcidJazz(boolean representiveOfAcidJazz) {
        this.representativeOfAcidJazz = representiveOfAcidJazz;
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
