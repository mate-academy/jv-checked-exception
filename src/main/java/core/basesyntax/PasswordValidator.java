package core.basesyntax;

public class PasswordValidator {
    private final int allowedLength = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.isEmpty()) {
            throw new PasswordValidationException("Password cannot be empty");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < allowedLength) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
    }
}
