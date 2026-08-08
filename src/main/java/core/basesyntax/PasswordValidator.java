package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(
                    "Password and repeat password must not be null"
            );
        }

        boolean isPasswordEquals = password.equals(repeatPassword);

        if (!isPasswordEquals || password.length() < MIN_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
