package core.basesyntax;

public class PasswordValidator {
    public static Boolean numberChecker(String password) {
        try {
            Integer.parseInt(password);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    public static void validate(
            String password, String repeatPassword)
            throws PasswordValidationException {

        if (PasswordValidator.numberChecker(password)) {

            if (password == null
                    || password.length() == 0
                    || password.length() >= 10
                    && !password.equals(repeatPassword)) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } else {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
    }
}
