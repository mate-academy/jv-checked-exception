package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        try {
            if (password.length() < 10 && !password.equals(repeatPassword)) {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
