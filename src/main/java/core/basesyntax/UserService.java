package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        while (true) {
            try {
                passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
                saveUser(user);
                break;
            } catch (PasswordValidationException exception) {
                exception.printMessage();
                System.out.println("Your passwords are incorrect. Try again.");
            }
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
