package task01.user;

import task01.controller.InputController;
import task01.task.Task;

public class UserController {
    private UserManager userManager;
    private InputController inputController;

    public UserController(UserManager userManager, InputController inputController) {
        this.userManager = userManager;
        this.inputController = inputController;
    }

    public User registerUser() {
        String name = inputController.promptUserForString("Enter name");
        String email = inputController.promptUserForString("Enter email");
        String password = inputController.promptUserForString("Enter password");

        return userManager.registerUser(name, email, password);
    }

    public void assignTask(User user, Task task) {
        user.addTask(task);
    }
}