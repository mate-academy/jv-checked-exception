package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_LENGTH = 10;
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if(password != null){
            boolean passwordLength = password.length() >= PASSWORD_LENGTH
                    && repeatPassword.length() >= PASSWORD_LENGTH;
            if (password.equals(repeatPassword) && passwordLength) {
                System.out.println("got em");
        } throw new PasswordValidationException("Wrong passwords");


            } throw new PasswordValidationException("Wrong passwords");
        }
    }


