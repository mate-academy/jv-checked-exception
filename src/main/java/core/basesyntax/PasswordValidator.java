package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if ((repeatPassword != null) && repeatPassword.equals(password)
                && (password.length() >= 10)) {
            return;
        }
        {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}

