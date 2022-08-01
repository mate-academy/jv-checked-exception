package core.basesyntax;

import core.basesyntax.exceptions.PasswordValidationException;

public class UserService {
    public void registerUser(User user){
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveUser(User user){
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
