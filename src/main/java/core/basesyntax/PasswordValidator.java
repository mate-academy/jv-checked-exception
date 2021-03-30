package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword) {
        return password.equals(repeatPassword);
    }
}
