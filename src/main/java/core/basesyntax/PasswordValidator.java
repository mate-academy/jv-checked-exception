package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

/**
 * Реализовать класс PasswordValidator.
 * Создать метод validate(), который проверяет формат пароля.
 */

public class PasswordValidator {

    /**
     * Сгенерировать исключение, если строка равна null.
     * Сгенерировать исключение, если строка меньше 10 символов.
     * Сгенерировать исключение, если строки не равны.
     */
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() < 10 || repeatPassword.length() < 10
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }

        return true;
    }
}
