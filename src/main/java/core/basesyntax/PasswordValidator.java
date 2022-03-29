package core.basesyntax;

public class PasswordValidator extends RuntimeException {
    public void validate(String password, String repeatPassword) {
        if ((password.equals(repeatPassword) && password.length() >= 10) == false) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
