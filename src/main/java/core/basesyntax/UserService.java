package core.basesyntax;

public class UserService {
    private static final String INCORRECT_PASSWORDS_MESSAGE =
            "Your passwords are incorrect. Try again.";

    public void registerUser(User user) {
        PasswordValidator validator = new PasswordValidator();
        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println(INCORRECT_PASSWORDS_MESSAGE);
            return;
        }
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
