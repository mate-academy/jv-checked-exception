package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null
                || repeatPassword == null
                || password.length() != repeatPassword.length()
                || password.length() < 10
        ) {
            throw new PasswordValidationException("Wrong passwords");
        }

        char[] passwordCharArr = password.toCharArray();
        char[] repeatPasswordCharArr = repeatPassword.toCharArray();

        for (int i = 0; i < passwordCharArr.length; i++) {
            if (passwordCharArr[i] != repeatPasswordCharArr[i]) {
                throw new PasswordValidationException("Passwords are not equal!");
            }
        }
    }
}
