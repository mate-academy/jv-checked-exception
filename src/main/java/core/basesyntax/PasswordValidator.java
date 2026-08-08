package core.basesyntax;

public class PasswordValidator {

    public void validate(String password, String repeat) throws PasswordValidationException {

        if (isPasswordValid(password, repeat)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }

    private static boolean isPasswordValid(String password, String repeatPassword) {
        return password == null || repeatPassword == null
                || password.isBlank() || repeatPassword.isBlank()
                || password.length() < 10
                || repeatPassword.length() < 10
                || !password.equals(repeatPassword);
    }
}
