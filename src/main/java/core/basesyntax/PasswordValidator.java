package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
       if (password == null && repeatPassword == null) {
           throw new PasswordValidationException("Wrong passwords");
       }
       if (!password.equals(repeatPassword)
                || (password.length() < MIN_LENGTH)
                || (repeatPassword.length() < MIN_LENGTH)) {
            throw new PasswordValidationException("Wrong passwords");
       }
    }
}


