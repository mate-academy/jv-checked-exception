package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();
    public void registerUser(User user) throws PasswordValidationException {
        boolean isValid = passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        if (isValid) {
            saveUser(user);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
