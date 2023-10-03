package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator;

    public UserService() {
        passwordValidator = new PasswordValidator();
    }

    public void registerUser(User user) {
        String password = user.getPassword();
        String repeatPassword = user.getRepeatPassword();
        try {
            passwordValidator.validate(password, repeatPassword);
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
