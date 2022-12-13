package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {

        try {
            if (password == null || repeatPassword == null) {
                throw new PasswordValidationException("null");
            }
            if ((password.toCharArray().length >= 10
                    && repeatPassword.toCharArray().length >= 10)
                    && password.equals(repeatPassword)) {
                return true;
            } else if ((password.toCharArray().length < 4
                    && repeatPassword.toCharArray().length < 4) && !password.equals("")) {
                return false;
            } else if (password.equals("")) {
                throw new PasswordValidationException("empty");
            } else if (!password.equals(repeatPassword)) {
                throw new PasswordValidationException("Wrong passwords");
            } else {
                throw new PasswordValidationException("Wrong passwords");
            }

        } catch (PasswordValidationException e) {
            throw e;
        }
    }
}

