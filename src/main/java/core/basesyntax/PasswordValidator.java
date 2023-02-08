package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) {
        if (password == null || password.length() < 0 || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
