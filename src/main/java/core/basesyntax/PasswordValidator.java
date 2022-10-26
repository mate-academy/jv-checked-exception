package core.basesyntax;

public class PasswordValidator extends Exception {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (!(password.equals(repeatPassword)) && password.length() >= 10
                || password.isEmpty() || repeatPassword.isEmpty()) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}

