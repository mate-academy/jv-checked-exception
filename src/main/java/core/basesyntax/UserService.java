package core.basesyntax;

import java.net.PasswordAuthentication;

public class UserService {
    public void registerUser(User user) throws PasswordValidationException {
        PasswordValidator passwordValidator = new PasswordValidator();
        if (user != null) {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        }
    }

    public void saveUser(User user) throws PasswordValidationException {
        if (user.getRepeatPassword().equals(user.getPassword())
                && user.getRepeatPassword().length() >= 10) {
            System.out.println("User " + user.toString() + " was saved to database!!!");
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
