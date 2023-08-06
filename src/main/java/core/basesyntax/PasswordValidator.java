package core.basesyntax;

public class PasswordValidator {
    public static final int PASSWORD_MIN_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() < PASSWORD_MIN_LENGTH || repeatPassword.length()
                < PASSWORD_MIN_LENGTH || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
    }
}

