package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator;

    public UserService(PasswordValidator passwordValidator) {
        this.passwordValidator = passwordValidator;
    }

    public void registerUser(User user) {
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
