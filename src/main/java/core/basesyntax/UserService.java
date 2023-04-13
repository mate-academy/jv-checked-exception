package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator;
    String password;
    String repeatPassword;
    public UserService() {
        this.passwordValidator = new PasswordValidator();
    }
    public void registerUser(User user) {
        try {
            passwordValidator.validate(password, repeatPassword);
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
