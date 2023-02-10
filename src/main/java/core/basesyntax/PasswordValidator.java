package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_LENGTH = 10; 
    
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null 
                || repeatPassword.length() < MIN_LENGTH || !repeatPassword.equals(password)) {
            throw new PasswordValidationException("Wrong password");
        }
    }
}
