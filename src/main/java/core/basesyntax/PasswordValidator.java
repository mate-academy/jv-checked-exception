package core.basesyntax;

public class PasswordValidator {

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if (password != null) {
            if (password.equals(repeatPassword)) {
                if (password.length() >= 10) {
                    new UserService();
                } else {
                    throw new PasswordValidationException("Your passwords are incorrect. "
                            + "Try again.");
                }
            } else {
                throw new PasswordValidationException("Wrong passwords");
            }
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
//test
