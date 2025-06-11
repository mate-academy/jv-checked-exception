package core.basesyntax;

import java.util.Arrays;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        char[] passwordArray = password.toCharArray();
        char[] repeatPasswordArray = repeatPassword.toCharArray();

        if (passwordArray.length < 10 || !Arrays.equals(passwordArray, repeatPasswordArray)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
