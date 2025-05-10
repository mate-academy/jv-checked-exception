package core.basesyntax;

public class PasswordValidator {
    public void validate(
            String password,
            String repeatPassword
    ) throws PasswordValidationException {
        nullCheck(password);
        nullCheck(repeatPassword);
        emptyCheck(password);
        emptyCheck(repeatPassword);
        equalsCheck(password, repeatPassword);
    }

    private void nullCheck(String password) throws PasswordValidationException {
        if (password == null) {
            throw new PasswordValidationException("Null password");
        }
    }

    private void emptyCheck(String password) throws PasswordValidationException {
        if (password.isEmpty()) {
            throw new PasswordValidationException("Empty password");
        }
    }

    private void equalsCheck(
            String password,
            String repeatPassword
    ) throws PasswordValidationException {
        if (!(password.equals(repeatPassword) && password.length() >= 10)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
