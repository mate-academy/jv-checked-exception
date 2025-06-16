package core.basesyntax;
public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        throw (password == null || repeatPassword == null) ? new PasswordValidationException("Wrong passwords")
        : (password != repeatPassword ) ? new PasswordValidationException("Wrong passwords")
        : (password.length() <= 10 || repeatPassword.length() <= 10 ) ? new PasswordValidationException("Wrong passwords")
        : new PasswordValidationException("Correct");
    }
}

