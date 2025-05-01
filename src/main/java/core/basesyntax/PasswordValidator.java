package core.basesyntax;

import java.io.Closeable;

public class PasswordValidator implements Closeable {
    private static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {
            if (!password.equals(repeatPassword) || password.length() < MIN_PASSWORD_LENGTH) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } catch (NullPointerException e) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }

    @Override
    public void close() {
        System.exit(0);
    }
}
