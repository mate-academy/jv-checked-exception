package core.basesyntax;

import java.io.IOException;

public class PasswordValidationException extends IOException {
    public PasswordValidationException(String message) {
        System.out.println(message);
    }
}
