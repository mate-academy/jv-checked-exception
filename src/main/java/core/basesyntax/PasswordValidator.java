package core.basesyntax;

public class PasswordValidator {

    private static final int PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        boolean checkedDIfferent = false;
        boolean checkedLength = false;
        if (password != null || repeatPassword != null) {
            checkedDIfferent = password.equals(repeatPassword);
            checkedLength = password.length() >= PASSWORD_LENGTH
                    && repeatPassword.length() >= PASSWORD_LENGTH;
        }
        if (!checkedDIfferent || !checkedLength) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
