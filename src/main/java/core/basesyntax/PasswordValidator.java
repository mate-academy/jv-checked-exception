package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null
                || repeatPassword == null
                || !password.equals(repeatPassword)
                || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }

    public static void validate(User user) throws PasswordValidationException {
        new PasswordValidator().validate(user.getPassword(), user.getRepeatPassword());
    }

}
