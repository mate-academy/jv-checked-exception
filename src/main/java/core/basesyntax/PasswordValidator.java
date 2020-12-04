package core.basesyntax;

public class PasswordValidator {
    
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if (password == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.equals("")) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (repeatPassword.equals("")) {

            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.equals(repeatPassword) && password.length() >= 10) {

            return true;
        }

        throw new PasswordValidationException("Wrong passwords");

    }
}
