package core.basesyntax;

import java.nio.file.attribute.UserPrincipalNotFoundException;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.length() < 10 || repeatPassword == null
        || repeatPassword.length() < 10 || !password.equals(repeatPassword)){
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
