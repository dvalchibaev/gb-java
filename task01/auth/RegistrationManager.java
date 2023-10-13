package task01.auth;

import task01.controller.InputController;

public class RegistrationManager {
    private InputController inputController;

    public RegistrationManager(InputController inputController) {
        this.inputController = inputController;
    }

    public boolean registerUser() {
        String name = inputController.promptUserForString("Enter name");
        String email = inputController.promptUserForString("Enter email");
        String password = inputController.promptUserForString("Enter password");

        // Implement registration logic (returning a success status for simplicity)
        return true;
    }
}