package core.basesyntax;

public class Main {
    public static void main(String[] args) throws PasswordValidationException {
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.validate("test_12345", "Test_12345");
    }
}
