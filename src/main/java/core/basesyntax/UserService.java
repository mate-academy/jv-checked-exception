package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator = new PasswordValidator();
    public void registerUser(User user) {
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            throw new RuntimeException("System was unable to register using. Password requirements are ignored", e);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
