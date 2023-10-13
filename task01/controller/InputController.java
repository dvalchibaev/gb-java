package task01.controller;

import java.util.List;

public abstract class InputController {
    public abstract String promptUserForString(String message);

    public abstract List<String> promptUserForTags(String message);

    public abstract int promptUserForInteger(String message);

    // Add more methods for different types of input if needed
}