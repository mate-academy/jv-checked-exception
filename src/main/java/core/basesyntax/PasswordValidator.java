package core.basesyntax;

public class PasswordValidator extends Exception {

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password.length() < 10 || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }


}
