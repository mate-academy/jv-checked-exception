package core.basesyntax;

public class PasswordValidator {
    private static final int MAX_PASS_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || (password.length() < MAX_PASS_LENGTH
                && repeatPassword.length() < MAX_PASS_LENGTH)
                || password.isEmpty() || repeatPassword.isEmpty()) {
            throw new PasswordValidationException("Wrong passwords");
        }
        // this if-block I need to check, is passwords equals or not
        if (password.equals(repeatPassword)) {
            System.out.print("");
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
