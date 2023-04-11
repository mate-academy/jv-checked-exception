package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        boolean isEqual = password.equals(repeatPassword);
        boolean isCorrect = password.length() <= 10 && repeatPassword.length() <= 10;
        if (!isEqual && !isCorrect) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
