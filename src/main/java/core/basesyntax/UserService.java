package core.basesyntax;

public class UserService {
    private final PasswordValidator ps = new PasswordValidator();

    public void registerUser(User user) {
        try {
            ps.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println(Constants.WRONG_PASSWORD_MESSAGE_USER_SERVICE);
        }

    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
