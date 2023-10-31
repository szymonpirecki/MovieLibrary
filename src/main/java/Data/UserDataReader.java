package Data;

import Enums.DateType;
import Enums.NameType;
import Printers.ErrorMessagePrinter;
import Printers.InfoMessagePrinter;
import Validation.UserDataValidator;

import java.util.Scanner;

public class UserDataReader {

    private static final Scanner scanner = new Scanner(System.in);

    public static void closeScanner() {
        scanner.close();
    }

    public static Integer getChoiceFromUser() {
        while (true) {
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                if (UserDataValidator.checkIfChoiceIsValid(choice)) {
                    return choice;
                } else {
                    ErrorMessagePrinter.printInvalidChoiceErrorMessage();
                }
            } catch (java.util.InputMismatchException e) {
                scanner.next();
                ErrorMessagePrinter.printNotANumberErrorMessage();
            }
        }
    }

    public static int[] getTimeRangeFromUser() {
        int dateFrom = getDateFromUser(DateType.DATE_FROM);
        int dateTo = getDateFromUser(DateType.DATE_TO);
        return new int[]{dateFrom, dateTo};
    }


    private static int getDateFromUser(DateType dateType) {
        while (true) {
            try {
                InfoMessagePrinter.printDetailRequestMessage(dateType);
                int date = scanner.nextInt();
                scanner.nextLine();
                if (UserDataValidator.checkIfDateIsValid(date)) {
                    return date;
                } else {
                    ErrorMessagePrinter.printYearBelowZeroErrorMessage();
                }
            } catch (java.util.InputMismatchException e) {
                scanner.next();
                ErrorMessagePrinter.printNotANumberErrorMessage();
            }
        }
    }

    public static String getNameFromUser(NameType nameType) {
        while (true) {
            InfoMessagePrinter.printDetailRequestMessage(nameType);
            String name = scanner.nextLine();
            if (UserDataValidator.checkIfNameIsValid(name)) {
                return name;
            }
        }
    }
}