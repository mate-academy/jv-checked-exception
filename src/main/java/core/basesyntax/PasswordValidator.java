package core.basesyntax;

public class PasswordValidator {
    private String password;
    private String repeatPassword;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        // логіка
        this.password = password;
        this.repeatPassword = repeatPassword;
    }
}
