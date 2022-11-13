package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_NUMBER_OF_CHARECTERS = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if (password == null || password.length() < MIN_NUMBER_OF_CHARECTERS
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
