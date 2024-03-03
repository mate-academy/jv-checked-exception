package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) 
            throws PasswordValidationException {
        boolean isNull = password == null || repeatPassword == null;
        boolean isMismatchOrShort = !password.equals(repeatPassword) || password.length() < 10;
        
        if (isNull || isMismatchOrShort) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
