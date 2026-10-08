package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_CHARACTER_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        boolean isNull = isNull(password, repeatPassword);

        if (isNull) {
            throw new PasswordValidationException("input is null");
        }

        boolean isLenValid = isLengthValid(password.length(), repeatPassword.length());
        boolean isPassEqualsToRepeated = isPassEqualsToRepeated(password, repeatPassword);

        if (!isLenValid || !isPassEqualsToRepeated) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }

    public boolean isNull(String password, String repeatPassword) {
        return password == null || repeatPassword == null;
    }

    private boolean isLengthValid(int passLen, int passRepLen) {
        return passLen >= MIN_CHARACTER_PASSWORD && passRepLen >= MIN_CHARACTER_PASSWORD;
    }

    private boolean isPassEqualsToRepeated(String password, String repeatPassword) {
        return password.equals(repeatPassword);
    }
}
