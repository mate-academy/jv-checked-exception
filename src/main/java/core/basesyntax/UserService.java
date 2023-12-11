package core.basesyntax;

import static java.lang.System.out;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException ex) {
            out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        out.println("User " + user.toString() + " was saved to database!!!");
    }
}
