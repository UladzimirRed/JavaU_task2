package by.epam.task2.entity;

import java.util.Objects;

public class HipHop extends MusicalComposition {

    private boolean alternativeHipHopMembership;

    public HipHop(boolean alternativeHipHopMembership, String artist, String title, int duration) {
        super(MusicalGenre.HIP_HOP, artist, title, duration);
        this.alternativeHipHopMembership = alternativeHipHopMembership;
    }

    public boolean isAlternativeHipHopMembership() {
        return alternativeHipHopMembership;
    }

    public void setAlternativeHipHopMembership(boolean alternativeHipHopMembership) {
        this.alternativeHipHopMembership = alternativeHipHopMembership;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HipHop hipHop = (HipHop) o;
        return alternativeHipHopMembership == hipHop.alternativeHipHopMembership;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), alternativeHipHopMembership);
    }

    @Override
    public String toString() {
        return "Track{" +
                "artist - " + this.getArtist() +
                "; title - " + this.getTitle() +
                "; duration(sec) - " + this.getDuration() +
                "; Genre - " + this.getMusicalGenres() +
                "; Alternative Hip Hop Membership - " + alternativeHipHopMembership +
                '}';
    }
}