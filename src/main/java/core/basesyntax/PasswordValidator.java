package core.basesyntax;

import java.util.Objects;

public class PasswordValidator {
    /**
     * Перевіряє паролі на відповідність та мінімальну довжину (>= 10).
     *
     * @param password Пароль користувача.
     * @param repeatPassword Повторення пароля.
     * @throws PasswordValidationException Викидається, якщо валідація не пройдена.
     */
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (!Objects.equals(password, repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }

    }
}
