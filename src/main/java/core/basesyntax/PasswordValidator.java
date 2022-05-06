package core.basesyntax;

public class PasswordValidator {
    private static String chars = "\\\'\"@";

    public static void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new NullPointerException();
        }
        if (!(password.equals(repeatPassword) && password.length() >= 10)) {
            throw new PasswordValidationException("Ваші паролі неправильні. Спробуйте ще раз.");
        }
    }
}
