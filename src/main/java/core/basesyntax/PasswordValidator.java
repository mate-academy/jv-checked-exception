package core.basesyntax;

public class PasswordValidator {

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {
            if (password.equals("")) {
                throw new PasswordValidationException("Empty input data");
            } else if (password.length() < 10) {
                throw new PasswordValidationException("Wrong passwords");
            } else if (!password.equals(repeatPassword)) {
                throw new PasswordValidationException("Wrong passwords");
            }

        } catch (NullPointerException e) {
            throw new PasswordValidationException("Password can`t be null");
        }
    }
}
