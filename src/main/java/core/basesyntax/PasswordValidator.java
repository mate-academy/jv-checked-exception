package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws AuthenticationException {
        if (password.length() != repeatPassword.length()) {
            throw new AuthenticationException("Wrong passwords");
        }
    }
}
