package by.epam.task2.entity;

import java.util.Objects;

public abstract class MusicalComposition {

    private String artist;
    private String title;
    private MusicalGenre musicalGenre;
    private int duration;

    public MusicalComposition(MusicalGenre musicalGenre, String artist, String title, int duration) {
        this.artist = artist;
        this.title = title;
        this.musicalGenre = musicalGenre;
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

    public MusicalGenre getMusicalGenres() {
        return musicalGenre;
    }

    public void setMusicalGenre(MusicalGenre musicalGenres) {
        this.musicalGenre = musicalGenres;
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
        MusicalComposition that = (MusicalComposition) o;
        return duration == that.duration &&
                Objects.equals(artist, that.artist) &&
                Objects.equals(title, that.title) &&
                musicalGenre == that.musicalGenre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, title, musicalGenre, duration);
    }
}