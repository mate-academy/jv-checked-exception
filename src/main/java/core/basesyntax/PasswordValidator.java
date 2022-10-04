package core.basesyntax;

public class PasswordValidator {
    static final int MIN_PASSWORD_SIZE = 10;
    private boolean validPassword;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null && repeatPassword != null & password.equals(repeatPassword)
                & password.length() >= MIN_PASSWORD_SIZE) {
            validPassword = true;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
