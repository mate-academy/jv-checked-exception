package core.basesyntax;

public class PasswordValidator {
    public PasswordValidator() {

    }

    public void validate(String pass, String repPass) throws PasswordValidationException {
        if (pass == null || repPass == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (pass.equals(repPass) && pass.length() >= 10) {
            return;
        }

        throw new PasswordValidationException("Wrong passwords");
    }

}
