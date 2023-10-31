package Printers;

import Validation.UserDataValidator;

public class ErrorMessagePrinter {

    public static void printInvalidChoiceErrorMessage() {
        System.out.println("Invalid choice");
        System.out.println("Choose one of these numbers: " + UserDataValidator.VALID_USERS_CHOICES);
    }

    public static void printNotANumberErrorMessage() {
        System.out.println("That's not a number. Try again.");
    }

    public static void printYearBelowZeroErrorMessage() {
        System.out.println("Year has to be greater than 0");
    }
}

