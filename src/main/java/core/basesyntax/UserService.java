package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        boolean isPasswordValid = false;
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            isPasswordValid = true;
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
        if (isPasswordValid) {
            saveUser(user);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
