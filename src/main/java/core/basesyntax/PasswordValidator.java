package core.basesyntax;

public class PasswordValidator {
    private static final String ERROR =  "Wrong passwords";
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || password.length() < 10 || !repeatPassword.equals(password)) {
            throw new PasswordValidationException(ERROR);
        }
    }
}
