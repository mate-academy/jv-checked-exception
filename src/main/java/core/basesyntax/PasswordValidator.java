package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_LENGTH = 10;
    public void validate(String password, String repeatPassword) {
        try {
            boolean passwordLength = password.length() >= PASSWORD_LENGTH && repeatPassword.length() >= PASSWORD_LENGTH;
            if (passwordLength && password.equals(repeatPassword)){

            }

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
