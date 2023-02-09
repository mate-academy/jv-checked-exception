package core.basesyntax;

public class UserService {
    PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        User user1 = new User(user.getEmail(), user.getPassword(), user.getRepeatPassword());
        try {
            passwordValidator.validate(user1.getPassword(), user1.getRepeatPassword());
        } catch (RuntimeException e) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
        saveUser(user1);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
