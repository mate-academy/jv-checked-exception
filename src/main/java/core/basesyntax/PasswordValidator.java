package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (
            !isPasswordCorrect(password) 
            || !isPasswordCorrect(repeatPassword)
            || !password.equals(repeatPassword)
        ) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }

    public boolean isPasswordCorrect(String password) {
        return (password != null && password.length() >= 10);
    }
}
