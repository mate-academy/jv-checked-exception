package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        try {
            if (password == null) {
                throw new PasswordValidationException("Your passwords are incorrect. Try again.");
            } else if (repeatPassword == null) {
                throw new PasswordValidationException("Your passwords are incorrect. Try again.");
            } else if (password.length() < 10 || repeatPassword.length() < 10) {
                throw new PasswordValidationException("Wrong passwords");
            }
            if (password.equals(repeatPassword)) {
                return true;
            }
            throw new PasswordValidationException("Wrong passwords");
        } catch (PasswordValidationException e) {
            //System.out.println("Your passwords are incorrect. Try again.");
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
