package core.basesyntax;

import java.io.IOException;

public class PasswordValidator {
    private static String chars = "\\\'\"@";

    public static void validate(String password, String repeatPassword) throws IOException {
        if (!(password.equals(repeatPassword) && password.length() >= 10)) {
            throw new PasswordValidationException("Ваші паролі неправильні. Спробуйте ще раз.");
        }
    }
}
