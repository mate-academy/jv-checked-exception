package core.basesyntax;

public class PasswordValidator {

    private static final String WRONG_MSG = "Wrong passwords";

    public void validate(String password,
                         String repeatPassword) throws PasswordValidationException {
        if ((password == null) || (repeatPassword == null)) {
            throw new PasswordValidationException(WRONG_MSG);
        }
        if (!(password.equals(repeatPassword))) {
            throw new PasswordValidationException(WRONG_MSG);
        }
        if ((password.length() < 10)) {
            throw new PasswordValidationException(WRONG_MSG);
        }
    }
}
