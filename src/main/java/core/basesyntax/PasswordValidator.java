package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        // Перевірка на null
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password and repeatPassword must not be null.");
        }

        // Перевірка, чи співпадають паролі та їх довжина
        if (!password.equals(repeatPassword) || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
