package core.basesyntax;

public class PasswordValidator {
    public void validate(String passwrd, String repeatPasswrd) throws PasswordValidationException {
        if (passwrd == null || !passwrd.equals(repeatPasswrd) || passwrd.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
