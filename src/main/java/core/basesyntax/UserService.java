package core.basesyntax;

public class UserService {
    private PasswordValidator validator = new PasswordValidator();

    public void registerUser(User user) {

        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
            return;
        }
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
