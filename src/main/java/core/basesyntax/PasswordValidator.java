package core.basesyntax;

class PasswordValidator {
    public static void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password cannot be null");
        }
        if (!password.equals(repeatPassword) || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}


