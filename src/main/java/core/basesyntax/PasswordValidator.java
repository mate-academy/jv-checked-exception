package core.basesyntax;

public class PasswordValidator {

    public static final double MIN_LEN = 10;

    public static void validate(String password, String repeatPassword) {
        boolean isValid = (password == null || repeatPassword == null
                || password.length() < MIN_LEN || repeatPassword.length() < 10
                || !password.equals(repeatPassword));
        if (!isValid) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
