package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) {
        if (!password.equals(repeatPassword) || password.toCharArray().length < 10) {
            throw new PasswordValidationException("Wrong password");
        }
    }
}
