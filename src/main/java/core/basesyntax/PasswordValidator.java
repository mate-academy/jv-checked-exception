package core.basesyntax;

public class PasswordValidator {
    private boolean isCorrect;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.equals(repeatPassword)
                && password.length() >= 10
                && repeatPassword.length() >= 10) {
            isCorrect = true;
        }
        if (isCorrect == false) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
