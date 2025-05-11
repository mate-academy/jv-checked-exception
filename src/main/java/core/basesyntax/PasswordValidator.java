package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        boolean isInvalid = password == null || repeatPassword == null;
        isInvalid = isInvalid || !password.equals(repeatPassword);
        isInvalid = isInvalid || password.length() < 10;

        if (isInvalid) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
