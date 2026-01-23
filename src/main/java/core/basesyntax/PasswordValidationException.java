package core.basesyntax;

class PasswordValidationException extends Exception {
    public PasswordValidationException() {
        super();
    }

    public PasswordValidationException(String message) {
        super(message);
    }
}
