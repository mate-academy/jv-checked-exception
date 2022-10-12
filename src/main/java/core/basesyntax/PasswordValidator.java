package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws Exception {
        if (!password.equals(repeatPassword) && password.length() < 10) {
            try {
                throw new PasswordValidationException("Wrong passwords");
            } catch (PasswordValidationException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
