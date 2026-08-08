package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (checkNull(password, repeatPassword)
                && checkLong(password, repeatPassword)
                && checkPasswords(password, repeatPassword)) {
            return;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }

    private boolean checkLong(String first, String second) {
        return first.length() == second.length() && first.length() >= 10;
    }

    private boolean checkPasswords(String password, String repeatPassword) {
        return password.equals(repeatPassword);
    }

    private boolean checkNull(String password, String repeatPassword) {
        return password != null && repeatPassword != null;
    }
}
