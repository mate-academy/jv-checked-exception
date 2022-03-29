package core.basesyntax;

public class UserService {
    private PasswordValidator validator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            if (user != null) {
                validator.validate(user.getPassword(), user.getRepeatPassword());
                saveUser(user);
            }
        } catch (PasswordValidationException ex) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
