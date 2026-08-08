package core.basesyntax;

public class PasswordValidator {
    public static final int VALID_PASSWORD_LENGTH = 10;

    public void validate(String password,String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        int combinedLength = (password.length() + repeatPassword.length()) / 2;

        if (!(password.equals(repeatPassword)) || (combinedLength < VALID_PASSWORD_LENGTH)) {
            throw new PasswordValidationException("Wrong passwords");
        }

    }
}
