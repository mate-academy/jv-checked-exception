package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        if (user != null) {
            try {
                passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
                saveUser(user);
            } catch (PasswordValidationException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Your passwords are incorrect. Try again");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
