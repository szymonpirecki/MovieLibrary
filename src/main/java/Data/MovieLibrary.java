package Data;

import MovieDetails.Actor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

public class MovieLibrary {

    public List<Movie> movies;

    public MovieLibrary() {
    }

    public MovieLibrary(String jsonFileName) throws IOException {
        this.movies = importMoviesFromResources(jsonFileName);
    }

    public List<String> getMoviesFromSpecificTimeRange(int[] timeRange) {
        return movies.stream()
                .filter(m -> m.getDate() >= timeRange[0])
                .filter(m -> m.getDate() <= timeRange[1])
                .map(Movie::getTitle)
                .toList();
    }

    public Movie getRandomMovieData() {
        return movies.get(new Random().nextInt(movies.size()));
    }

    public List<String> getMoviesOfSpecificActor(String actorsFirstName, String actorsLastName) {
        Actor desiredActor = new Actor(actorsFirstName, actorsLastName);
        return movies.stream()
                .filter(m -> m.getActors().contains(desiredActor))
                .map(Movie::getTitle)
                .collect(Collectors.toList());
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Data.MovieLibrary{" +
                "movies=" + movies +
                '}';
    }

    private List<Movie> importMoviesFromResources(String jsonFileName) throws IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        File jsonFile = new File(Objects.requireNonNull(classLoader.getResource(jsonFileName)).getFile());
        return new ObjectMapper().readValue(new File(jsonFile.toURI()), MovieLibrary.class).getMovies();
    }
}
