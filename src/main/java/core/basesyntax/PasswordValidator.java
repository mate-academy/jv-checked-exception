package core.basesyntax;

import core.basesyntax.exceptions.PasswordValidationException;

public class PasswordValidator {

    public static final int PASS_LENGTH = 10;
    UserService userService = new UserService();

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password.equals(repeatPassword) && password.length() >= PASS_LENGTH) {
            System.out.println("Success!!!");
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
