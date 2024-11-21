package core.basesyntax;
import java.util.HashSet;

public class UserServise {
    private HashSet<User> userDatabase;
    public UserServise() {
        this.setUserDatabase(new HashSet<>());
    }

    public void registerUser(String email, String password, String repeatPassword) {
        try {
            validatePassword(password, repeatPassword);
            User newUser = new User(email, password, repeatPassword);
            saveUser(newUser);
            System.out.println("User registered successfully: " + email);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to register user: " + e.getMessage());
        }
    }

    private void saveUser(User user) {
        if (getUserDatabase().add(user)) {
            System.out.println("User saved successfully.");
        } else {
            System.out.println("User already exists in the database.");
        }
    }

    private void validatePassword(String password, String repeatPassword) {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty.");
        }
        if (!password.equals(repeatPassword)) {
            throw new IllegalArgumentException("Passwords do not match.");
        }
    }

    public HashSet<User> getUserDatabase() {
        return userDatabase;
    }

    public void setUserDatabase(HashSet<User> userDatabase) {
        this.userDatabase = userDatabase;
    }
}


