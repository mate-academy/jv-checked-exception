package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        try {
            if (password.length() >= 10 && password.equals(repeatPassword)) {
                System.out.println();
            } else {
                throw new PasswordValidationException("Wrong passwords");
            }
        } catch (NullPointerException e) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
