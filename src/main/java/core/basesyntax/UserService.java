package core.basesyntax;

public class UserService {

    private PasswordValidator passwordvalidator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            passwordvalidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
            System.out.println("User successfully registered!");

        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private void saveUser(User user) {

        System.out.println("User " + user.toString() + " was saved to database");
    }
}
