package core.basesyntax;

//import java.util.regex.PatternSyntaxException;

public class PasswordValidator {
    static final int MIN_PASSWORD = 10;
    static final String EXEPTION_MESSAGE1 = "Wrong passwords";
    static final String EXEPTION_MESSAGE2 = "Your passwords are incorrect. Try again.";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null) {
            throw new PasswordValidationException(EXEPTION_MESSAGE1);
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException(EXEPTION_MESSAGE1);
        }
        if (password.length() < MIN_PASSWORD) {
            throw new PasswordValidationException(EXEPTION_MESSAGE2);
        }
    }
}
