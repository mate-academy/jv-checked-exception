package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_LENGHT = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null
                && password.equals(repeatPassword)
                && password.length() >= PASSWORD_LENGHT) {
            System.out.println("");
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
