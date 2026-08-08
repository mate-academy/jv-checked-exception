package core.basesyntax;

/**
 * Перевірене виключення (Checked Exception) для сигналізації
 * про помилки валідації паролів. Успадковується від Exception,
 * що вимагає обов'язкової обробки (try-catch) або оголошення (throws).
 */
public class PasswordValidationException extends Exception {
    public PasswordValidationException(String message) {
        super(message);
    }
}
