package core.basesyntax.exception;

/**
 * Создать класс исключение PasswordValidationException.
 * Класс должен расширять Exception.
 * Исключение должно быть checked.
 * Создать перегруженный конструктор с сообщением об ошибке.
 */

public class PasswordValidationException extends Exception {
    public PasswordValidationException(String message) {
        super(message);
    }
}
