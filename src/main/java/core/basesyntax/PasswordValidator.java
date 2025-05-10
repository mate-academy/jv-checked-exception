package core.basesyntax;

public class PasswordValidator {
    public void validate(String pass, String repeatPass) throws PasswordValidationException {
        if (pass == null || repeatPass == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (!pass.equals(repeatPass) || pass.length() < 9) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
