package task01.auth;

import task01.controller.InputController;
import task01.user.User;
import task01.user.UserManager;

public class AuthManager {
    private UserManager userManager;
    private InputController inputController;

    public AuthManager(UserManager userManager, InputController inputController) {
        this.userManager = userManager;
        this.inputController = inputController;
    }

    public User registerUser() {
        String name = inputController.promptUserForString("Enter name");
        String email = inputController.promptUserForString("Enter email");
        String password = inputController.promptUserForString("Enter password");

        return userManager.registerUser(name, email, password);
    }

    // Other authentication-related methods
}