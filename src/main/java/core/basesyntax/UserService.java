package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class UserService {
    private PasswordValidator validatorPassword = new PasswordValidator();

    public void registerUser(User user) {
        try {
            validatorPassword.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
