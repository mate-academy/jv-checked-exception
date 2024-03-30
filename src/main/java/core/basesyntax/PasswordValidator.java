package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password.length() >= 10 && repeatPassword.equals(password)){
            return;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
