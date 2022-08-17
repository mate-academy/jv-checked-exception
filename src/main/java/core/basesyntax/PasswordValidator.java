package core.basesyntax;

public class PasswordValidator {
    private final String errorMessage = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        checkIfEmpty(password, repeatPassword);
        validatePasswordsEqual(password, repeatPassword);
        validateLength(password);
    }

    private void checkIfEmpty(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(errorMessage);
        }
    }

    private void validatePasswordsEqual(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password.compareTo(repeatPassword) != 0) {
            throw new PasswordValidationException(errorMessage);
        }
    }

    private void validateLength(String password) throws PasswordValidationException {
        if (password.length() < 10) {
            throw new PasswordValidationException(errorMessage);
        }
    }
}
