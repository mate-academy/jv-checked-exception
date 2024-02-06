package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password == null || password.length() < 10 || password != repeatPassword) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
