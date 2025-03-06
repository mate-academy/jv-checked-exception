package core.basesyntax;

import java.util.HashSet;

public class UserService {
    private HashSet<User> userDatabase;

    public UserService() {
        this.userDatabase = new HashSet<>();
    }

    public void registerUser(User user) {
        try {
            PasswordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private void saveUser(User user) {
        if (userDatabase.add(user)) {
            System.out.println(user + " was saved to database!!!");
        } else {
            System.out.println("User already exists in the database.");
        }
    }

    public HashSet<User> getUserDatabase() {
        return userDatabase;
    }
}




