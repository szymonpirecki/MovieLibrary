package Data;

import Printers.InfoMessagePrinter;
import Printers.UserDataPrinter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MovieLibrary movieLibrary = new MovieLibrary("movies.json");

        while (true) {
            InfoMessagePrinter.printUsersOptions();
            switch (UserDataReader.getChoiceFromUser()) {
                case 1 ->
                        UserDataPrinter.printMoviesFromSpecificTimeRange(UserDataReader.getTimeRangeFromUser(), movieLibrary);
                case 2 -> UserDataPrinter.printRandomMovieData(movieLibrary);
                case 3 -> UserDataPrinter.printMoviesOfSpecificActor(movieLibrary);
                case 4 -> {
                    UserDataReader.closeScanner();
                    System.exit(0);
                }
            }
        }


    }
}
