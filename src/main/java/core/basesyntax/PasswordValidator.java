package core.basesyntax;

public class PasswordValidator {
    public void validate(String pass, String repeatPass) throws PasswordValidationException {
        if (pass == null || repeatPass == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (pass.length() < 10 || repeatPass.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (!pass.equals(repeatPass)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
