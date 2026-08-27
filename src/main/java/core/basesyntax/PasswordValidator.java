package core.basesyntax;

public class PasswordValidator {
    static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(String pass, String repeatPass) throws PasswordValidationException {
        if (pass == null || !pass.equals(repeatPass)
                || pass.length() < MIN_PASSWORD_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
