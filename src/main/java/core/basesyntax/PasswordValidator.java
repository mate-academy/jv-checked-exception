package core.basesyntax;

public class PasswordValidator {
    private static final String MESSAGE = "Wrong passwords";
    private static final int PASSWODS_LENGTH = 10;
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password.length() < PASSWODS_LENGTH || (!password.equals(repeatPassword))){
            throw  new PasswordValidationException(MESSAGE);
        }
    }
}
