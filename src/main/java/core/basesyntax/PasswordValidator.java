package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_LENGTH = 10;
    private static final String WRONG_PASSWORDS = "Wrong passwords";

    public void validate(String password,String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(WRONG_PASSWORDS);
        }

        if (password.length() < MIN_LENGTH || !password.equals(repeatPassword)) {
            throw new PasswordValidationException(WRONG_PASSWORDS);
        }
    }
}
