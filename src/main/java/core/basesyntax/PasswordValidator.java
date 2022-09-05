package core.basesyntax;

class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        String err = "Your passwords are incorrect. Try again.";
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(err);
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < 10 || repeatPassword.length() < 10) {
            throw new PasswordValidationException(err);
        }
        if (password.trim().equals("")) {
            throw new PasswordValidationException(err);
        }
    }
}
