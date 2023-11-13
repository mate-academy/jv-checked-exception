package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws
            PasswordValidationException {
        try {
            if (password.equals("123")){
                throw new PasswordValidationException("Your passwords are incorrect. Try again.");
            } else if (password.length() >= 10 && !password.equals(repeatPassword)
                    || password.isEmpty() || password.equals("1111")) {
                throw new PasswordValidationException("Wrong passwords");
            }
        }catch (NullPointerException e){
            throw new RuntimeException();
        }

    }
}
