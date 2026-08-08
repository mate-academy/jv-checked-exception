package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String pasRep) throws PasswordValidationException {
        if (password.equals(pasRep) && password.length() >= 10) {
            throw new PasswordValidationException("Wrong passowrds");
        }
    }
}
