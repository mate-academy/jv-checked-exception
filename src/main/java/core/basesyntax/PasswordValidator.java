package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if ((password != null && repeatPassword != null)) {
            if (((password.length() >= 10 && repeatPassword.length() >= 10)
                    && (password.equals(repeatPassword))) != true) {
                System.out.println("Your passwords are incorrect. Try again.");
                throw new PasswordValidationException("Wrong passwords");
            }
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }

    }

}
