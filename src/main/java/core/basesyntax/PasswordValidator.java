package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        try {
            if (password == null || repeatPassword == null) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } catch (NullPointerException e) {
            e.toString();
        }
        if (!password.equals(repeatPassword) || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
