package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        //write your code here
//        if (password == null || repeatPassword == null) {
//            throw new PasswordValidationException("Wrong passwords");
//        }
        final int PASS_LENGTH = 10;
        final boolean PASS_NOT_VALID = password == null
                || repeatPassword == null
                || password.length() < PASS_LENGTH
                || repeatPassword.length() < PASS_LENGTH
                || !(password.equals(repeatPassword));

        if (PASS_NOT_VALID) {
           throw new PasswordValidationException("Wrong passwords");
        }
    }
}
