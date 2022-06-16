package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            if (!(user.getPassword().isEmpty() || user.getRepeatPassword().isEmpty())) {
                passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
                saveUser(user);
            }
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
