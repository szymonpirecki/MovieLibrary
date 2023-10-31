package Data;

import MovieDetails.Actor;
import MovieDetails.Director;

import java.util.List;
import java.util.stream.Collectors;

public class Movie {

    private String title;
    private int date;
    private Director director;
    private String genre;
    private List<Actor> actors;

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "title: " + title + "\n" +
                "date: " + date + "\n" +
                "director: " + director + "\n" +
                "genre: " + genre + "\n" +
                "actors: " + actors.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

}
