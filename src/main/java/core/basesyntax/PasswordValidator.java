package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_MAX_LENGTH = 10;

    public boolean validate(String password, String repeatPassword) throws
            PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password or repeatPassword cannot be null");
        }

        if (password.equals(repeatPassword) && password.length() >= PASSWORD_MAX_LENGTH) {
            System.out.println("Successful");
            return true;
        }

        throw new PasswordValidationException("Wrong passwords");
    }
}
