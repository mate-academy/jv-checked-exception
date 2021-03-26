package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class UserService {

    /**
     * Получить объект user.
     * Проверить поля password и passwordRepeat.
     * Если формат паролей вернный сохранить пользователя.
     * Иначе сгенерировать исключение PasswordValidationException.
     */
    public void registerUser(User user) {
        try {
            PasswordValidator validatorPassword = new PasswordValidator();
            if (validatorPassword.validate(user.getPassword(), user.getRepeatPassword())) {
                saveUser(user);
            }
        } catch (NullPointerException | PasswordValidationException ex) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
