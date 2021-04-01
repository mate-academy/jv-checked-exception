package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class UserService {

    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();
        boolean passwordIsCorrect;
        try {
            passwordIsCorrect = passwordValidator.validate(user.getPassword(),
                    user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
            passwordIsCorrect = false;
        }
        if (passwordIsCorrect) {
            saveUser(user);
        }

    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
