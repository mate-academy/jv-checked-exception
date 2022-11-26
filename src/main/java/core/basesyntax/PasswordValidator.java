package core.basesyntax;

public class PasswordValidator {
    private boolean isEqual;
    private boolean isLongEnough;
    private static final PasswordValidationException p = new PasswordValidationException("Wrong passwords");

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw p;
        }
        if (password.equals(repeatPassword)) {
            isEqual = true;
        }
        if (password.length() >= 10 && repeatPassword.length() >= 10) {
            isLongEnough = true;
        }
        if (isEqual != true  || isLongEnough != true) {
            throw p;
        }
    }
}
