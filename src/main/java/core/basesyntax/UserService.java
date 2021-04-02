package core.basesyntax;
/*
Метод registerUser () должен вызывать метод validate () и обрабатывать исключение.
Если все в порядке, сохраните пользователя в базе данных (используйте метод saveUser ()), если нет,
выведите сообщение «Ваши пароли неверны. Повторите попытку.».
 */

import core.basesyntax.exception.PasswordValidationException;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();
        try{
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
