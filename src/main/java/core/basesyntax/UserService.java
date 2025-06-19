package core.basesyntax;

public class UserService {
    private static final String wrongPasswordMsg = "Your passwords are incorrect."
            + " Try again.";
    private final PasswordValidator passwordValidator;

    public UserService() {
        this.passwordValidator = new PasswordValidator();
    }

    public void registerUser(User user) {
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println(wrongPasswordMsg);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
