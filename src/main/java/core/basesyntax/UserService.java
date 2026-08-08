package core.basesyntax;

public class UserService {
    private boolean isValid = false;
    private PasswordValidator validator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
            isValid = true;
        } catch (PasswordValidationException a) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
        if (isValid) {
            saveUser(user);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
