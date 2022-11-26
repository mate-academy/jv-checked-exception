package core.basesyntax;

public class PasswordValidator {
    private boolean isEqual;
    private boolean isLongEnough;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.equals(repeatPassword)) {
            isEqual = true;
        }
        if (password.length() >= 10 && repeatPassword.length() >= 10) {
            isLongEnough = true;
        }
        if (isEqual != true) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (isLongEnough !=true) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
