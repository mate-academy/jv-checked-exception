package core.basesyntax;

public class PasswordValidator {
    public static final int MINIMUN_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new RuntimeException();
        }
        if (!password.equals(repeatPassword) || password.length() < MINIMUN_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
