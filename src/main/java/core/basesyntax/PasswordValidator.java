package core.basesyntax;

public class PasswordValidator {
        //write your code here
        public void validate(String password, String repeatPassword) throws PasswordValidationException {
            if (password == null || password.length() < 10 ||
            !password.equals(repeatPassword)) {
                throw new PasswordValidationException("Wrong passwords");
            }
        }
    }

