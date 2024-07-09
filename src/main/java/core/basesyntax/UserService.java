package core.basesyntax;

public class UserService {
    private PasswordValidator validator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            if (validator.validate(user.getPassword(), user.getRepeatPassword())) {
                saveUser(user);
            }
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage()); // Print the exception message
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
