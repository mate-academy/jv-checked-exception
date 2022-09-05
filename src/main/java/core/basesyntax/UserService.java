package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();

        if (user != null) {
            try {
                passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
                saveUser(user);
            } catch (RuntimeException | PasswordValidationException exception) {
                throw new RuntimeException("Your passwords are incorrect. Try again." + exception);
            }
        } else {
            System.out.println("Your passwords are incorrect. Try again");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
