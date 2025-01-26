package core.basesyntax;

// Клас для перевірки паролів
public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        // Перевірка паролів
        if (password == null || repeatPassword == null || password.length() < 10 || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Incorrect passwords");
        }
    }
}
