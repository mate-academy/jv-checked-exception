package core.basesyntax;

public class PasswordValidator {
    private boolean isEqual;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password.equals(repeatPassword)) {
            isEqual = true;
        }
        if (!isEqual || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
