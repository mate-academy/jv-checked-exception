package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class UserService {
    public void registerUser(User user) {

        PasswordValidator userPasswordValidator = new PasswordValidator();

        try {
            userPasswordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Wrong passwords");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to data base!!!");
    }
}
