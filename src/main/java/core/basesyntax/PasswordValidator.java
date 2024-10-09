package core.basesyntax;

public void validate(String password, String repeatPassword) throws PasswordValidationException {
    if (password == null || repeatPassword == null
            || password.length() < MIN_PASSWORD_LENGTH
            || !password.equals(repeatPassword)) {
        throw new PasswordValidationException("Wrong passwords");
    }
}
