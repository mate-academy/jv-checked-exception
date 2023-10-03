package core.basesyntax;

public class UserService {

    private static final PasswordValidator validator = new PasswordValidator();

    public void registerUser(User user) {
        boolean isValid = true;
        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            isValid = false;
            System.out.println(e.getMessage());
        } finally {
            if (isValid) {
                saveUser(user);
            }
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
