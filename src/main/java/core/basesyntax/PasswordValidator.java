package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationExeption {

        if (!password.equals(repeatPassword) && password.length() < 10) {
            throw new PasswordValidationExeption("Wrong passwords");
        }
    }
}
