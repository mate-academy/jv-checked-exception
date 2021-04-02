package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

/*
Метод validate () должен сравнить пароль с repeatPassword и проверить,
больше ли их длина или равна 10. Если нет, выбросить исключение PasswordValidationException
с сообщением «Неверные пароли» (поскольку это наша собственная логика, давайте создадим
собственное проверенное исключение в отдельный пакет - исключение).
 */
public class PasswordValidator {
    public boolean validate(String password, String repeatPassword) throws PasswordValidationException {
        if (!(password.equals(repeatPassword) && password.length() >= 10)){
            throw new PasswordValidationException("Wrong passwords");
        }
        return true;
    }
}
