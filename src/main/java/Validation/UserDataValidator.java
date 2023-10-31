package Validation;

import java.util.List;

public class UserDataValidator {


    public final static List<Integer> VALID_USERS_CHOICES = List.of(1, 2, 3, 4);

    public static boolean checkIfChoiceIsValid(Integer choice) {
        return VALID_USERS_CHOICES.contains(choice);
    }

    public static boolean checkIfDateIsValid(int date) {
        return date > 0;
    }

    public static boolean checkIfNameIsValid(String name) {
        return !name.isEmpty();
    }
}
