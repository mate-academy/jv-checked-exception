package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) {

        public void validate(String password, String repeatPassword)
            throws PasswordValidationExeption {
            
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationExeption ("Wrong passwords");
        }
        if password.length() < 10 || repeatPassword.length() < 10) {
            throw new PasswordValidationExeption ("Wrong passwords");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}

