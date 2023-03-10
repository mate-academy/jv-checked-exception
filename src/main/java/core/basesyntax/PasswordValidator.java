package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password != repeatPassword || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
