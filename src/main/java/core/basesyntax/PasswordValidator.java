package core.basesyntax;

public class PasswordValidator {
    private static final int MAX_LENGHT = 10;

    public void validate(String password, String repeatPassword) throws
            PasswordValidationException {
        if (!password.equals(repeatPassword) || password.length() > MAX_LENGHT
                || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
