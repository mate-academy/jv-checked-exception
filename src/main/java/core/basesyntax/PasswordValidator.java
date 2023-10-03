package core.basesyntax;

public class PasswordValidator {

    private final int passMinLength = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (!password.equals(repeatPassword) || password.length() < passMinLength) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
