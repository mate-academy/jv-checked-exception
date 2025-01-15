package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidatorException {
        if (password == null || repeatPassword == null || !password.equals(repeatPassword) || password.length() < 10) {
            throw new PasswordValidatorException("Wrong passwords");
        }
    }
}

