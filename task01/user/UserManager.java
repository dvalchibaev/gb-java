package task01.user;

import task01.data.DataHandler;

public class UserManager {
    private DataHandler dataHandler;

    public UserManager(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    public User registerUser(String name, String email, String password) {
        // Implement user registration logic
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        dataHandler.saveUser(user);
        return user;
    }

    public User getUserById(String userId) {
        return dataHandler.getUserById(userId);
    }

    // Other user management methods
}