package core.basesyntax;

public class UserService {
    private final PasswordValidator validator = new PasswordValidator();

    public void registerUser(User user) throws PasswordValidationException {
        validator.validate(user.getPassword(), user.getRepeatPassword());
        saveUser(user);

    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
