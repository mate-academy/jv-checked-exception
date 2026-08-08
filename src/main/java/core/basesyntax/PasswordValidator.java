package core.basesyntax;

public class PasswordValidator {
    private static final int NUMBER_OF_DIGITS_IN_THE_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if (password == null
                || repeatPassword == null
                || password.length() < NUMBER_OF_DIGITS_IN_THE_PASSWORD
                || repeatPassword.length() < NUMBER_OF_DIGITS_IN_THE_PASSWORD
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
