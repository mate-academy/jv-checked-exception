package core.basesyntax;

public class PasswordValidator {

    public boolean validate(String password,
                            String repeatPassword) throws PasswordValidationException {

        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        } else if ((repeatPassword.length() < 10 || password.length() < 10)) {
            throw new PasswordValidationException("Wrong passwords");
        } else {
            return password.equals(repeatPassword);
        }
    }
}
