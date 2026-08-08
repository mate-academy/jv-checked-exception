package core.basesyntax;

public class UserService {
    private static final String ERROR_MSG = "Your passwords are incorrect. Try again.";
    private final PasswordValidator validator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println(ERROR_MSG);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
