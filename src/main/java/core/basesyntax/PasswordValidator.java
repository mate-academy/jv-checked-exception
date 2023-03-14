package core.basesyntax;

public class PasswordValidator {

    private static final int passwordLength = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (!password.equals(repeatPassword)
                || !(password.length() >= passwordLength)
                || repeatPassword == null
                || password == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
