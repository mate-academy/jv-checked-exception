package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        //write your code here
        try {
            if (passwordValidator.validate(user.getPassword(),
                    user.getRepeatPassword())) {
                saveUser(user);
            }
        } catch (PasswordValidationException exception) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
