package core.basesyntax;

public class PasswordValidator {
    public static final int PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        boolean notValidPassword = password == null
                || repeatPassword == null
                || password.length() < PASSWORD_LENGTH
                || repeatPassword.length() < PASSWORD_LENGTH
                || !(password.equals(repeatPassword));

        if (notValidPassword) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
