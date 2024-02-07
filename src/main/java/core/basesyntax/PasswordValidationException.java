package core.basesyntax;

class PasswordValidationException extends RuntimeException {
    public PasswordValidationException(String massage) {
        super(massage);
    }
}
