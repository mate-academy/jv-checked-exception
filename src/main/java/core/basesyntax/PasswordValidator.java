package core.basesyntax;

public class PasswordValidator {
    public static final String MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(MESSAGE);
        }

        if (password.equals(repeatPassword) && password.length() >= 10) {
            // Нічого не робимо, тому що умова виконується в іншому класі
        } else {
            throw new PasswordValidationException(MESSAGE);
        }
    }
}
