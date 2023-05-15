package core.basesyntax;

public class PasswordValidator {

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null
                || repeatPassword == null) {
            throw new IllegalArgumentException("Password or Repeat Password "
                    + "fields cannot be set to zero");
        }
        if (!password.equals(repeatPassword) || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
