package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if(password.equals(repeatPassword)) {
            try {
                if (password.length() < 10) {
                    throw new PasswordValidationException("Wrong passwords");
                }
            } catch (PasswordValidationException e) {
                e.printStackTrace();
            }
        }
    }
}
