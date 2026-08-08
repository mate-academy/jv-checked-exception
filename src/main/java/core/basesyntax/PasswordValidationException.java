package core.basesyntax;

import java.io.IOException;

//write your code here
public class PasswordValidationException extends IOException {

    public PasswordValidationException(String message) {
        super(message);
    }
}
