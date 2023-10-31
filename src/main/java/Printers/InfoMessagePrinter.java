package Printers;

public class InfoMessagePrinter {

    public static void printUsersOptions() {
        System.out.println("_______________________________");
        System.out.println("Select one of the following options");
        System.out.println("""
                1 – Search for movies by time range
                2 – View information about a random movie
                3 – Search for movies by a particular actor
                4 – End program""");
    }

    public static void printDetailRequestMessage(Enum userInput) {
        System.out.println("Please provide: " + userInput.toString());
    }
}
