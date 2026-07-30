package core.basesyntax;

public class UserService {
    private static final String VALIDATION_FAILED_MESSAGE =
            "Your passwords are incorrect. Try again.";

    public void registerUser(User user) {
        try {
            new PasswordValidator().validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println(VALIDATION_FAILED_MESSAGE);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
