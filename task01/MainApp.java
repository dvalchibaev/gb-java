package task01;

import task01.auth.AuthManager;
import task01.auth.RegistrationManager;
import task01.controller.ConsoleInputController;
import task01.controller.InputController;
import task01.data.DataHandler;
import task01.task.Task;
import task01.task.TaskController;
import task01.task.TaskManager;
import task01.user.User;
import task01.user.UserController;
import task01.user.UserManager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler();
        UserManager userManager = new UserManager(dataHandler);
        InputController inputController = new ConsoleInputController();
        AuthManager authManager = new AuthManager(userManager, inputController);
        RegistrationManager registrationManager = new RegistrationManager(inputController);
        TaskManager taskManager = new TaskManager();
        TaskController taskController = new TaskController(taskManager);
        UserController userController = new UserController(userManager, inputController);

        // Sample registration and authentication
        User currentUser = null;

        while (true) {
            System.out.println("==== Task Manager ====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int choice = inputController.promptUserForInteger("Enter your choice");

            switch (choice) {
                case 1:
                    System.out.println("===== User Registration =====");
                    currentUser = registrationManager.registerUser();
                    System.out.println("Registration successful. User ID: " + currentUser.getId());
                    break;

                case 2:
                    System.out.println("===== User Login =====");
                    currentUser = authManager.authenticateUser();
                    if (currentUser != null) {
                        System.out.println("Login successful. Welcome, " + currentUser.getName() + "!");
                    } else {
                        System.out.println("Login failed. Please try again.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // Interaction based on user login status
            if (currentUser != null) {
                // Sample task creation and assignment
                List<String> tags = inputController.promptUserForTags("Enter tags (comma-separated)");
                Task task = taskController.createTask("Task", "Description", new Date(), new Date(), tags);
                userController.assignTask(currentUser, task);

                // Display user and tasks
                System.out.println("User: " + currentUser);
                System.out.println("Assigned tasks: " + currentUser.getTasks());
            }
        }
    }
}