package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        boolean areEquals = password.equals(repeatPassword);
        boolean goodLength = password.length() >= 10;
        if (areEquals == false || goodLength == false) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
