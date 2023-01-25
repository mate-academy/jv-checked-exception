package core.basesyntax;

public class PasswordValidationException extends Exception {
    private String message;

    public PasswordValidationException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }
}

