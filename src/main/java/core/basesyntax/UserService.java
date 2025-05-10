package core.basesyntax;

public class UserService {
    private static final int MIN_PASSWORD_LENGTH = 10;
    private PasswordValidator validator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
        if (user.getPassword().length() >= MIN_PASSWORD_LENGTH
                && user.getPassword().equals(user.getRepeatPassword())) {
            this.saveUser(user);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
