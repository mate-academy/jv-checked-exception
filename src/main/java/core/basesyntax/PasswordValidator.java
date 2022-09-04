package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)throws PasswordValidationException {
        boolean check =  password.equals(repeatPassword);
        if (password.length() <= 10 || repeatPassword.length() <= 10){
           throw  new PasswordValidationException("Your length is not incorrect. Try again.");
        } else if (!check){
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
    }
}
