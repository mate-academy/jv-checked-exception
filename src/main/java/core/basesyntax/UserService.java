package core.basesyntax;

public class UserService {
    private final PasswordValidator validator = new PasswordValidator();
    private final Database database = new Database();

    public void registerUser(User user) {
        try {
            String password = user.getPassword();
            String repeatPassword = user.getRepeatPassword();
            validator.validate(password, repeatPassword);
            database.saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }
}
