package core.basesyntax;

public class UserService {
    static final PasswordValidator pw = new PasswordValidator();

    public void registerUser(User user) {
        try {
            pw.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
