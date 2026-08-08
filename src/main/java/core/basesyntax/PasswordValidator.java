package core.basesyntax;

public class PasswordValidator {
    public static final String EXEPTION_MEASSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                | !password.equals(repeatPassword) | password.length() < 10) {
            throw new PasswordValidationException(EXEPTION_MEASSAGE);
        }
    }
}
