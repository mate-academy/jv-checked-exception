package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordException {
        if (password.length() < 10 || !password.equals(repeatPassword)) {
            throw new PasswordException("Wrong passwords");
        }
    }
}
