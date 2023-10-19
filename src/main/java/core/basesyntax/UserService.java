package core.basesyntax;

// import com.sun.source.util.SourcePositions;

public class UserService {
    public void registerUser(User user) {
        try {
            new PasswordValidator().validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
        if (user.getPassword().length() >= 10
                && user.getPassword().equals(user.getRepeatPassword())) {
            this.saveUser(user);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
