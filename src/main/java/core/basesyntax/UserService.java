package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator;

    public UserService(PasswordValidator passwordValidator) {
        this.passwordValidator = passwordValidator;
    }

    public void registerUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
