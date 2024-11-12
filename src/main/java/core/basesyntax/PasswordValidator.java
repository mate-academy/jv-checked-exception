package core.basesyntax;

public class PasswordValidator {


    public void validate(User user) throws PasswordValidationException {
        String password = user.getPassword();
        String repeatPassword = user.getRepeatPassword();

        if (password == null || repeatPassword == null || !password.equals(repeatPassword) || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
