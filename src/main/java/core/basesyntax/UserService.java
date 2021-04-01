package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();
        if (passwordValidator.validate(user.getPassword(), user.getRepeatPassword())) {
            saveUser(user);
            System.out.println("User saved");
            return;
        } else {
        }
        throw new PasswordValidationException("Your passwords are incorrect. Try again");
    }

    public void saveUser(User user) {

        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
