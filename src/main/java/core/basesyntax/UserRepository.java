package core.basesyntax;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<String, User> userStorage = new HashMap<>();

    public void saveUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null.");
        }
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty.");
        }
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty.");
        }
        userStorage.put(user.getUsername(), user);
        System.out.println("User " + user.toString() + " has been saved.");
    }

    public User findUserByUsername(String username) {
        return userStorage.get(username);
    }
}