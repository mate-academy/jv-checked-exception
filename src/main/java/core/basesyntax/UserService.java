package core.basesyntax;

public class UserService {
    public void registerUser(User user) throws PasswordValidationException {
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
    }

    public void saveUser(User user) {
        User user1 = new User(user.getEmail(), user.getPassword(), user.getRepeatPassword());
        System.out.println("User " + user1.toString() + " was saved to database!!!");
    }
}
