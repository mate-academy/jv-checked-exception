package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if (password != null) {
            if (password.length() < 10) {
                wrongPasswords();
            } else if (!password.equals(repeatPassword)) {
                wrongPasswords();
            }
        } else {
            wrongPasswords();
        }
    }

    private void wrongPasswords() throws PasswordValidationException {
        throw new PasswordValidationException("Wrong passwords");
    }
}
