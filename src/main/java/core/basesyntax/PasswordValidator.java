package core.basesyntax;

public class PasswordValidator {
    public static final int MESSAGE_MIN_SIZE = 10;

    public void validate(String pas, String repeatPas) throws PasswordValidationException {
        if (pas == null || pas.length() < MESSAGE_MIN_SIZE || !pas.equals(repeatPas)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
