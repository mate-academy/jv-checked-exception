package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {
            if ((password == null && repeatPassword == null) || !password.equals(repeatPassword)
                    || (password.length() < 10
                    && repeatPassword.length() < 10)) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } catch (PasswordValidationException a) {
            System.out.println("Your passwords are incorrect. Try again.");
        }

    }
}
