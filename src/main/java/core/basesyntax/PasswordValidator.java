package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code her
        if ((password != null || repeatPassword != null)
                && (password.equals(repeatPassword)) && (password.length() >= 10)) {
            String correct = "correct";
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
