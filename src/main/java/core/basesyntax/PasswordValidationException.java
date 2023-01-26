package core.basesyntax;

public class PasswordValidationException extends Exception {
    private String message;

    public PasswordValidationException(String message) {
        this.message = message;
        System.out.println(message);
    }
}

