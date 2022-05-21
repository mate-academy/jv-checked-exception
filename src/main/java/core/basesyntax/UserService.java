package core.basesyntax;

public class UserService {
    private boolean isCorrect = true;

    public UserService() {
    }

    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException n) {
            System.out.println("Your passwords are incorrect. Try again.");
            isCorrect = false;
        }
        if (isCorrect) {
            saveUser(user);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
