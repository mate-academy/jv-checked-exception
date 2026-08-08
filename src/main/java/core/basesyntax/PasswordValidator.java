package core.basesyntax;

public class PasswordValidator {

    void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        int minLength = 10;

        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() < minLength || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
