package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        final int MinPassLength = 10;

        if (password != repeatPassword
                && (password.length() <= MinPassLength || repeatPassword.length() <= MinPassLength)) {
                    throw new PasswordValidationException("Wrong passwords");
        };
    }
}
