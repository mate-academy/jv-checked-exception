package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) 
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Passwords cannot be null");
        }
        boolean isMismatchOrShort = !password.equals(repeatPassword) || password.length() < 10;
        
        if (isMismatchOrShort) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
