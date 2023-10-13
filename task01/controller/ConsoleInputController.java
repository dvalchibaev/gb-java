package task01.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInputController extends InputController {
    private Scanner scanner;

    public ConsoleInputController() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String promptUserForString(String message) {
        System.out.print(message + ": ");
        return scanner.nextLine();
    }

    @Override
    public List<String> promptUserForTags(String message) {
        System.out.print(message + ": ");
        String tagsInput = scanner.nextLine();
        String[] tagsArray = tagsInput.split(",");
        List<String> tags = new ArrayList<>();
        for (String tag : tagsArray) {
            tags.add(tag.trim());
        }
        return tags;
    }

    @Override
    public int promptUserForInteger(String message) {
        System.out.print(message + ": ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Consume the invalid input
        }
        return scanner.nextInt();
    }
}