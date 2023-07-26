package core.basesyntax;

public class UserService {
    public static final PasswordValidator PASSWORD_VALIDATOR = new PasswordValidator();
    public static final String INCORRECT_PASSWORDS_MESSAGE = "Your passwords are incorrect. "
            + "Try again.";

    public void registerUser(User user) {
        try {
            PASSWORD_VALIDATOR.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException exception) {
            System.out.println(INCORRECT_PASSWORDS_MESSAGE);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
