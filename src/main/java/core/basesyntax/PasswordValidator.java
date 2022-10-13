package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        int passLength = 10;
        boolean notValidPassword = password == null
                || repeatPassword == null
                || password.length() < passLength
                || repeatPassword.length() < passLength
                || !(password.equals(repeatPassword));

        if (notValidPassword) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
