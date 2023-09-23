package core.basesyntax;

public class UserService {
    public void registerUser(User user) throws PasswordValidationException {
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
