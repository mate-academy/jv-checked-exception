package core.basesyntax;

public class PasswordValidator {
    public static final int PASSWORD_ACCEPTABLE_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null && repeatPassword != null) {
            if (password.equals(repeatPassword)) {
                if (password.length() >= PASSWORD_ACCEPTABLE_LENGTH) {
                    return;
                }
            }
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
