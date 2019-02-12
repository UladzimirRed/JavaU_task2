package by.epam.task2.entity;

import java.util.Objects;

public abstract class MusicalCompositions {
    private String artist;
    private String title;
    private MusicalGenres musicalGenres;
    private int duration;

    public MusicalCompositions(MusicalGenres musicalGenres, String artist, String title, int duration) {
        this.artist = artist;
        this.title = title;
        this.musicalGenres = musicalGenres;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MusicalGenres getMusicalGenres() {
        return musicalGenres;
    }

    public void setMusicalGenres(MusicalGenres musicalGenres) {
        this.musicalGenres = musicalGenres;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicalCompositions that = (MusicalCompositions) o;
        return duration == that.duration &&
                Objects.equals(artist, that.artist) &&
                Objects.equals(title, that.title) &&
                musicalGenres == that.musicalGenres;
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, title, musicalGenres, duration);
    }
}
