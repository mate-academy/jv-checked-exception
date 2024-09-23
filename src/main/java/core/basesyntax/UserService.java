package core.basesyntax;

public class UserService {

    private final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {

        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException validationException) {
            System.out.println(validationException.getMessage());
        }
        //write your code here
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
