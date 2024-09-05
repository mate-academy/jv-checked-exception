package core.basesyntax;

public class UserService {
    private final PasswordValidator validator = new PasswordValidator();

    public void registerUser(User user) {
        String password = user.getPassword();
        String repeatPassword = user.getRepeatPassword();

        try {
            validator.validate(password, repeatPassword);
            saveUser(user);
        } catch (PasswordValidationException error) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
