package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        final int minimumSizePassword = 10;
        if ((password == null) || (repeatPassword == null)
                || (!password.equals(repeatPassword))
                || (password.length() < minimumSizePassword)
                || (repeatPassword.length() < minimumSizePassword)) {
            throw new PasswordValidationException("Wrong passwords");

        }
    }
}
