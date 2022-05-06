package core.basesyntax;

import java.io.IOException;

public class PasswordValidator {
    static String chars = "\\\'\"@";
    public static void validate(String password, String repeatPassword) throws IOException {
        if (!(password.equals(repeatPassword) && password.length() >= 10)) {
            throw new PasswordValidationException();
        }
        for (char c: chars.toCharArray()) {
            if (password.indexOf((int)c) != -1) {
                throw new NonValidCaseException();
            }
        }
    }
}
