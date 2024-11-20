package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) 
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Паролі не можуть бути null");
        }
        if (password.length() < 10 || repeatPassword.length() < 10) {
            throw new PasswordValidationException("Паролі повинні містити щонайменше 10 символів");
        }
        if (password.equals(repeatPassword) == false) {
            throw new PasswordValidationException("Паролі не співпадають");
        }
    }
}
