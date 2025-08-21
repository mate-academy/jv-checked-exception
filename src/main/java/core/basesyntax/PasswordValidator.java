package core.basesyntax;

public class PasswordValidator {
    private final int passwordLength = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if ((password == null || repeatPassword == null)
                || !password.equals(repeatPassword) || password.length() < passwordLength) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
