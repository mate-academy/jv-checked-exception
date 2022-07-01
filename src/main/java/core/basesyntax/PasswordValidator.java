package core.basesyntax;

public class PasswordValidator {
    private final static int passwordLength = 10;

    public void validate(String password, String repeatPassword) throws PasswordValidationException {

        boolean notValidPassword = password == null
                || repeatPassword == null
                || password.length() < passwordLength
                || repeatPassword.length() < passwordLength
                || !(password.equals(repeatPassword));

        if (notValidPassword) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
