package Printers;

import Data.Movie;
import Data.MovieLibrary;
import Data.UserDataReader;
import Enums.NameType;

import java.util.List;


public class UserDataPrinter {

    public static void printMoviesFromSpecificTimeRange(int[] timeRange, MovieLibrary movieLibrary) {
        List<String> moviesFromSpecificTimeRange = movieLibrary.getMoviesFromSpecificTimeRange(timeRange);
        moviesFromSpecificTimeRange.forEach(System.out::println);
    }

    public static void printRandomMovieData(MovieLibrary movieLibrary) {
        Movie movie = movieLibrary.getRandomMovieData();
        System.out.println(movie.toString());
    }

    public static void printMoviesOfSpecificActor(MovieLibrary movieLibrary) {
        String actorFirstNameFromUser = UserDataReader.getNameFromUser(NameType.ACTOR_FIRSTNAME);
        String actorLastNameFromUser = UserDataReader.getNameFromUser(NameType.ACTOR_LASTNAME);
        for (String movie : movieLibrary.getMoviesOfSpecificActor(actorFirstNameFromUser, actorLastNameFromUser)) {
            System.out.println(movie);
        }
    }

}
