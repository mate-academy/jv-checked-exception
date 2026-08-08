package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator = new PasswordValidator();
    private UserStorage userStorage = new UserStorage();

    public void registerUser(User user) {
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            userStorage.saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }
}


