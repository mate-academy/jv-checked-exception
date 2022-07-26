package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password.length() < 10 && repeatPassword.length() < 10
                && (password == null || repeatPassword == null) ) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }


}
